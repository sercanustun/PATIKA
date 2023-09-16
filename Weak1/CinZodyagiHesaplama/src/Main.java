import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz :");
        int remainderAfterBirthYearDividedBy12 = sc.nextInt() % 12;
        String zodiacSign = null;


        switch(remainderAfterBirthYearDividedBy12) {
            case 0:
               zodiacSign = "Maymun";
                break;
            case 1:
                zodiacSign = "Horoz";
                break;
            case 2:
                zodiacSign = "Köpek";
                break;
            case 3:
                zodiacSign = "Domuz";
                break;
            case 4:
                zodiacSign = "Fare";
                break;
            case 5:
                zodiacSign = "Öküz";
                break;
            case 6:
                zodiacSign = "Kaplan";
                break;
            case 7:
                zodiacSign = "Tavşan";
                break;
            case 8:
                zodiacSign = "Ejderha";
                break;
            case 9:
                zodiacSign = "Yılan";
                break;
            case 10:
                zodiacSign = "At";
                break;
            case 11:
                zodiacSign = "Koyun";
                break;
                
        }

        System.out.println("Zodyak burcunuz = " + zodiacSign);

    }
}