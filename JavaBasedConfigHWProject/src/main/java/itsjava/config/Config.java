package itsjava.config;

import itsjava.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("milk")
    public Milk milk() {
        return new Milk("Prostakvashino");
    }

    @Bean("cream")
    public Cream cream() {
        return new Cream("Petmol");
    }

    @Bean("coffee")
    public Coffee coffee() {
        return new Coffee("Arabika");
    }

    @Bean("MilkCoffee")
    public MilkCoffee MilkCoffee(Milk milk, Coffee coffee) {
        return new MilkCoffee(coffee, milk);
    }

    @Bean("CreamCoffee")
    public CreamCoffee CreamCoffee(Cream cream, Coffee coffee) {
        return new CreamCoffee(coffee, cream);
    }
}
