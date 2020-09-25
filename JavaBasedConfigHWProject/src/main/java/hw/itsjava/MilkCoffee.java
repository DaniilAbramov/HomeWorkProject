package hw.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MilkCoffee {
   private final Coffee coffee;
   private Milk milk;

   @Override
   public String toString() {
      return "Milk" + coffee + " with " + milk;
   }
}
