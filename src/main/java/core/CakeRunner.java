package core;

import java.util.Scanner;

public class CakeRunner {
    public static void main(String[] args) {
        Cake cake = new Cake("Cheesecake", 96.50,  "nonBake", "strawberry");
        //  System.out.println(cakes.getColor());
        System.out.println(cake.toString());
        System.out.println("Введите приемлемую цену тортика: ");

        Scanner scanner = new Scanner(System.in);
        double maxPrice = scanner.nextDouble();
        cake.whatPrice(maxPrice);


    }
}




//1. set get для этого тортика
//2. цена большая то покупаем тортик.
// цена маленькая то не покупаем.
//3. строковое представление.
//4. проект на гит Практика