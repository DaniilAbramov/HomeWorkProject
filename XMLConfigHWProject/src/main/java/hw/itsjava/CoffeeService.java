package hw.itsjava;

import java.util.Scanner;

public class CoffeeService {
    private final Coffee coffee;
    private final MilkCoffee milkCoffee;
    private final CreamCoffee creamCoffee;
    private final Milk milk;
    private final Cream cream;

    public CoffeeService(Coffee coffee, MilkCoffee milkCoffee, CreamCoffee creamCoffee, Milk milk, Cream cream) {
        this.coffee = coffee;
        this.milkCoffee = milkCoffee;
        this.creamCoffee = creamCoffee;
        this.milk = milk;
        this.cream = cream;
    }

    public void run() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Добро пожаловать в кофейню!" + "\n Выберите пункт из меню:\n 1. Обычный кофе\n 2. Кофе с молоком\n 3. Кофе со сливками\n 4. Посмотреть ассортимент\n 0. Выход из меню");
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
            } else if (choiceClient == 4) {
                System.out.println("1. Coffee - " + coffee.getSortCoffee() +
                        "\n2. Milk - " + milk.getMilk() +
                        "\n3. Cream - " + cream.getCream());
            } else {
                System.err.println("Такого номера нет");
            }
            System.out.println("Выберите пункт из меню!" + "\n 1. Обычный кофе\n 2. Кофе с молоком\n 3. Кофе со сливками\n 4. Посмотреть ассортимент\n 0. Выход из меню");
        }
    }
}
