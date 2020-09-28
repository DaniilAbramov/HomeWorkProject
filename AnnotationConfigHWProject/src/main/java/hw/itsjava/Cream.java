package hw.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Data
@Service("cream")
public class Cream implements Milky {
    private final String cream;

    @Autowired
    public Cream(@Value("Petmol") String cream) {
        this.cream = cream;
    }

    @Override
    public double getPercentage() {
        return 35.0;
    }

    @Override
    public String toString() {
        return "Cream" + " " + cream;
    }
}
