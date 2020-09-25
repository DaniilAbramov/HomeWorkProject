package hw.itsjava;

import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

//@ComponentScan({"hw.itsjava"})
public class CoffeeService {
    private final Coffee coffee;
    private final MilkCoffee milkCoffee;
    private  final CreamCoffee creamCoffee;

    public CoffeeService(Coffee coffee, MilkCoffee milkCoffee,CreamCoffee creamCoffee) {
        this.coffee = coffee;
        this.milkCoffee = milkCoffee;
        this.creamCoffee = creamCoffee;
    }

    public void run() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Добро пожаловать в кофейню!" + "\n Выберите пункт из меню:\n 1. Обычный кофе (Арабика)\n 2. Кофе с молоком\n 3. Кофе со сливками\n 4. Посмотреть ассортимент\n 0. Выход из меню");
        int choiceClient;
        while ((choiceClient = scr.nextInt()) != 0) {
            if (choiceClient == 1) {
                System.out.println("Your coffee - " + coffee.toString());
                break;
            } else if (choiceClient == 2) {
                System.out.println("Your coffee - " + milkCoffee.toString());
                break;
            } else if (choiceClient == 3) {
                System.out.println("Your coffee -  " + creamCoffee.toString());
                break;
            } else {
                System.err.println("Такого номера нет");
            }
            System.out.println("\nВыберите пункт из меню!" + "\n 1. Обычный кофе (Арабика)\n 2. Кофе с молоком\n 3. Кофе со сливками\n 4. Посмотреть ассортимент\n 0. Выход из меню");
        }
    }
}
