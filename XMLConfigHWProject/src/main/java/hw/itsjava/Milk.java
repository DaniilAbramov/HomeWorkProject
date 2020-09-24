package hw.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Milk implements Milky {
    private final String milk;

    @Override
    public double getPercentage() {
        return 3.6;
    }

    @Override
    public String toString() {
        return "hw.itsjava.Milk" + " " + milk;
    }
}
