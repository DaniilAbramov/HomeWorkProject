import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Milk implements Milky {
    private String milk;

    public Milk(String milk, String milkCoffee) {
    }

    @Override
    public double getPercentage() {
        return 3.6;
    }
}
