import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MilkCoffee {
   private final Coffee coffee;
   private MilkCoffee milkCoffee;
}
