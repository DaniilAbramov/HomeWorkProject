import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreamCoffee {
    private final Coffee coffee;
    private Cream cream;

    @Override
    public String toString() {
        return "CreamCoffee" + coffee + " with " + cream;
    }
}
