package Weak1.UcakBiletiFiyati;

import java.util.Scanner;

public class Main {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
     Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
      Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
      sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double distance = 0.0, normalPrice = 0.0, discountedPrice = 0.0, ageDiscountPrice = 0.0, totalPrice = 0.0, ageDiscount = 0.0, typeDiscount = 0.0, typeDiscountPrice = 0.0;
        int age = 0, journeyType = 0;
        double pricePerKm = 0.1;

        System.out.println("Mesafeyi km cinsinden giriniz :");
        distance = sc.nextDouble();
        System.out.println("Yasinizi giriniz :");
        age = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 -> tek yon , 2 -> gidis-donus) :");
        journeyType = sc.nextInt();

        if (distance < 0 || age < 0 || journeyType > 2 || journeyType < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            if (age < 12) {
                ageDiscount = 50;
            } else if (age >= 12 && age <= 25) {
                ageDiscount = 10;
            } else if (age > 65) {
                ageDiscount = 30;
            }
            if (journeyType == 2) {
                typeDiscount = 20;
            }

            normalPrice = distance * pricePerKm;
            ageDiscountPrice = normalPrice * (ageDiscount / 100);
            discountedPrice = normalPrice - ageDiscountPrice;
            typeDiscountPrice = discountedPrice * (typeDiscount / 100);
            totalPrice = (discountedPrice - typeDiscountPrice) * journeyType;

            System.out.println("Toplam Tutar = " + totalPrice + " TL");

        }
    }
}
