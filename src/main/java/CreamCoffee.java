import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreamCoffee {
    private final Coffee coffee;
    private CreamCoffee creamCoffee;

    @Override
    public String toString() {
        return "CreamCoffee{" +
                "coffee=" + coffee +
                ", creamCoffee=" + creamCoffee +
                '}';
    }
}
