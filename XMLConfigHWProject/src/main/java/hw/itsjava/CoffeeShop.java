package hw.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeShop {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("milk-context.xml");
        context.getBean(CoffeeService.class);

        new CoffeeService.run();
    }
}
