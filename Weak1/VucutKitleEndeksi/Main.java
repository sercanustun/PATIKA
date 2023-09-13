package Weak1.VucutKitleEndeksi;

import java.util.Scanner;

public class Main {
    /*
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
     Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double height = 0.0;
        double weight = 0.0;
        double bodyMassIndex = 0.0;

        System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz :");
        height = sc.nextDouble();
        System.out.println("Lutfen kilonuzu (kilogram cinsinden) giriniz :");
        weight = sc.nextDouble();

        bodyMassIndex = weight / (height * height);

        System.out.println("Vucut Kitle Endeksiniz : " + bodyMassIndex);


    }
}
