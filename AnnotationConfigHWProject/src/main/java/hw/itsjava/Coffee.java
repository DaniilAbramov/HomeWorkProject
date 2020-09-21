package hw.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@Service("coffee")
public class Coffee {
    private final String sortCoffee;

    @Override
    public String toString() {
        return "Coffee" + " " + sortCoffee;
    }
}
