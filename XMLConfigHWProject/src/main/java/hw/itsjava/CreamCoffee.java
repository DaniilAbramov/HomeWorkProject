package hw.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreamCoffee {
    private final Coffee coffee;
    private Cream cream;

    @Override
    public String toString() {
        return "hw.itsjava.Cream" + coffee + " with " + cream;
    }
}
