package hw.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Service("creamCoffee")
public class CreamCoffee {
    private final Coffee coffee;
    private Cream cream;

    @Override
    public String toString() {
        return "Cream" + coffee + " with " + cream;
    }
}
