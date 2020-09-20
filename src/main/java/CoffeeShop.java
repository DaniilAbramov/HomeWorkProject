import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CoffeeShop {


    public static void main(String[] args) {
        new CoffeeService().run();

    }
}
