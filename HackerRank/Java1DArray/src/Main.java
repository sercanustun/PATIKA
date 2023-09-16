package HackerRank.Java1DArray.src;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        int a = 20, b = 10;
        if ((a < b) & (b++ < 25)) {
            System.out.println(a);
        } else {
            System.out.print(a);
        }
        System.out.println(b);
    }
}
