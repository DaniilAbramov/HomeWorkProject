package hw.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeShop {

    public static void main(String[] args) {
        new CoffeeService().run();
        ApplicationContext context = new AnnotationConfigApplicationContext(CoffeeShop.class);
        context.getBean(CoffeeService.class).run();
    }
}
