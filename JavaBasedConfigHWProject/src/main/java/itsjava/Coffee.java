package itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffee {
    private final String sortCoffee;

    @Override
    public String toString() {
        return "Coffee" + " " + sortCoffee;
    }
}
