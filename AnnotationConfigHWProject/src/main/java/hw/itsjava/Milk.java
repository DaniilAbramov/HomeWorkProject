package hw.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Data
@Service("milk")
public class Milk implements Milky {
    private final String milk;

    @Autowired
    public Milk(@Value("Prostokvasheno") String milk) {
        this.milk = milk;
    }

    @Override
    public double getPercentage() {
        return 3.6;
    }

    @Override
    public String toString() {
        return "Milk" + " " + milk;
    }
}
