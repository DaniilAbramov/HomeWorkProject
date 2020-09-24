package hw.itsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CoffeeService {
    private final Coffee coffee;
    private final MilkCoffee milkCoffee;
    private  final CreamCoffee creamCoffee;


    public CoffeeService(Coffee coffee, MilkCoffee milkCoffee, CreamCoffee creamCoffee) {
        this.coffee = coffee;
        this.milkCoffee = milkCoffee;
        this.creamCoffee = creamCoffee;
    }

    public void run() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Добро пожаловать в кофейню!" + "\n Выберите пункт из меню:\n 1. Обычный кофе (Арабика)\n 2. Кофе с молоком\n 3. Кофе со сливками\n 4. Посмотреть ассортимент\n 0. Выход из меню");
//        ApplicationContext context = new ClassPathXmlApplicationContext("milk-context.xml");
        int choiceClient;
        while ((choiceClient = scr.nextInt()) != 0) {
            if (choiceClient == 1) {
//                Coffee coffee = context.getBean(Coffee.class);
                System.out.println("Your coffee - " + coffee.toString());
                break;
            } else if (choiceClient == 2) {
//                MilkCoffee milkCoffee = context.getBean(MilkCoffee.class);
                System.out.println("Your coffee - " + milkCoffee.toString());
                break;
            } else if (choiceClient == 3) {
//                CreamCoffee creamCoffee = context.getBean(CreamCoffee.class);
                System.out.println("Your coffee -  " + creamCoffee.toString());
                break;
//            } else if (choiceClient == 4) {
//                System.out.println("1. hw.itsjava.Coffee - " + context.getBean(Coffee.class) +
//                        "\n2. hw.itsjava.Milk - " + context.getBean(Milk.class) +
//                        "\n3. hw.itsjava.Cream - " + context.getBean(Cream.class));
            } else {
                System.err.println("Такого номера нет");
            }
            System.out.println("Выберите пункт из меню!" + "\n 1. Обычный кофе (Арабика)\n 2. Кофе с молоком\n 3. Кофе со сливками\n 4. Посмотреть ассортимент\n 0. Выход из меню");
        }
    }
}
