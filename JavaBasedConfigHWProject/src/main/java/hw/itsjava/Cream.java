package hw.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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
