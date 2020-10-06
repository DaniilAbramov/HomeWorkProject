package hw.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan({"hw.itsjava"})
public class CoffeeShop {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CoffeeShop.class);
        context.getBean(CoffeeService.class).run();
    }
}
