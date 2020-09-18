import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CoffeeShop {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Добро пожаловать в коффейню!" + "\n Выберите кофе:\n 1. Обычный кофе (Арабика)\n 2. Кофе с молоком\n 3. Кофе со сливками");
        ApplicationContext context = new ClassPathXmlApplicationContext("milk-context.xml");
        int choiceClient = scr.nextInt();
        if (choiceClient == 1) {
            Coffee coffee = context.getBean(Coffee.class);
            System.out.println("Your coffee - " + coffee.toString());
        } else if (choiceClient == 2) {
            MilkCoffee milkCoffee = context.getBean(MilkCoffee.class);
            System.out.println("coffeeMilk.toString() = " + milkCoffee.toString());
        } else if (choiceClient == 3) {
            CreamCoffee creamCoffee = context.getBean(CreamCoffee.class);
            System.out.println("creamCoffee.toString() = " + creamCoffee.toString());

        }

    }
}
