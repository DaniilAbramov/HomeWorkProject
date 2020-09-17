import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffee {
    private String sortCoffee;

    public Coffee(Coffee coffee, Milk milk) {
    }
}
