package hw.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@Service("milk")
public class Milk implements Milky {
    private final String milk;

    @Override
    public double getPercentage() {
        return 3.6;
    }

    @Override
    public String toString() {
        return "Milk" + " " + milk;
    }
}
