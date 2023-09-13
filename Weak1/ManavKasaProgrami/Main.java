package Weak1.ManavKasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double armutPrice = 2.14;
        double elmaPrice = 3.67;
        double domatesPrice = 1.11;
        double muzPrice = 0.95;
        double patlicanPrice = 5.0;

        double totalPrice = 0.0;

        System.out.println("Armut kac kilo ?");
        totalPrice = totalPrice + (armutPrice * sc.nextDouble());
        System.out.println("Elma kac kilo ?");
        totalPrice = totalPrice + (elmaPrice * sc.nextDouble());
        System.out.println("Domates kac kilo ?");
        totalPrice = totalPrice + (domatesPrice * sc.nextDouble());
        System.out.println("Muz kac kilo ?");
        totalPrice = totalPrice + (muzPrice * sc.nextDouble());
        System.out.println("Patlican kac kilo ?");
        totalPrice = totalPrice + (patlicanPrice * sc.nextDouble());

        System.out.println("TOPLAM TUTAR = " + totalPrice);
    }
}
