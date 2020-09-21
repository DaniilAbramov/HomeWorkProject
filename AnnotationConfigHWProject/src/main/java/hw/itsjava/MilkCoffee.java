package hw.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Service("milkCoffee")
public class MilkCoffee {
   private final Coffee coffee;
   private Milk milk;

   @Override
   public String toString() {
      return "Milk" + coffee + " with " + milk;
   }
}
