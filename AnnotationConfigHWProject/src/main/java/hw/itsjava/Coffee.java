package hw.itsjava;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Data
@Service("coffee")
public class Coffee {
    private final String sortCoffee;

    @Autowired
    public Coffee(@Value("Arabika") String sort) {
        this.sortCoffee = sort;
    }

    @Override
    public String toString() {
        return "Coffee" + " " + sortCoffee;
    }
}
