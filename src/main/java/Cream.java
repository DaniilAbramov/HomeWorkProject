import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Cream implements Milky {
    private String cream;

    public Cream(String cream) {
    }

    @Override
    public double getPercentage() {
        return 35.0;
    }
}
