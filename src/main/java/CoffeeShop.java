import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@AllArgsConstructor
public class CoffeeShop {
    private  Coffee coffee;
    private MilkCoffee milkCoffee;
    private CreamCoffee creamCoffee;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Добро пожаловать в коффейню!" + "\n Выберите кофе:\n 1. Обычный кофе (Арабика)\n 2. Кофе с молоком");
        ApplicationContext context = new ClassPathXmlApplicationContext("milk-context.xml");
        if (scr.nextInt() == 1) {
            Coffee coffee = context.getBean(Coffee.class);
            System.out.println("Your coffee - " + coffee.toString());
        } else if (scr.nextInt() == 2) {
            MilkCoffee coffeeMilk = context.getBean(MilkCoffee.class);
            System.out.println("coffeeMilk.toString() = " + coffeeMilk.toString());
        }

    }
}
