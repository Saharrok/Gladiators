package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваш класс гладитора:");
        System.out.println("1. Сатигариус-ловкость");
        System.out.println("2. Галус-танк");
        System.out.println("3. ССпартак-сила");
        int choice = scanner.nextInt();

        Gladiator gladiator = null;
        switch (choice) {
            case 1:
                gladiator = new Gallus(5, 2, 0, 1, 0, 3, 10, 30, true);
                System.out.println("Ваш выбор: Галус");
                break;
            case 2:
                gladiator = new Sagittarius(2, 2, 0, 5, 0, 2, 8, 20, false);
                System.out.println("Ваш выбор: Сатигарус");
                break;
            case 3:
                gladiator = new Spartac(2, 5, 0, 2, 0, 1, 14, 15, false);
                System.out.println("Ваш выбор: Спартак");
                break;
            default:
                System.out.println("Что то пошло не так");
        }

        scanner.close();
    }
}