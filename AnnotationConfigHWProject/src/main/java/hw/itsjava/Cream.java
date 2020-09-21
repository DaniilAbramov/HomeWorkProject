package hw.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@Service("cream")
public class Cream implements Milky {
    private final String cream;

    @Override
    public double getPercentage() {
        return 35.0;
    }

    @Override
    public String toString() {
        return "Cream" + " " + cream;
    }
}
