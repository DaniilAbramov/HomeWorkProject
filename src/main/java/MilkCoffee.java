import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MilkCoffee {
    Coffee coffee;
    MilkCoffee milkCoffee;
}
