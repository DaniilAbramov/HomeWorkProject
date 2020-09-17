import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreamCoffee {
    Coffee coffee;
    CreamCoffee creamCoffee;

    @Override
    public String toString() {
        return "CreamCoffee{" +
                "coffee=" + coffee +
                ", creamCoffee=" + creamCoffee +
                '}';
    }
}
