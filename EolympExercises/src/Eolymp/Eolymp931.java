package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp931 {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        double b = 1;
        double c = 0;
        double nisbet;

        if (n > 0 && n <= 2 * 1000000 * 1000) { // 934
            while (n > 0) {
                a = n % 10; // 4 3 9
                n = n / 10; // 93 9 0
                b = b * a; // 4 12 108
                c = c + a; // 4 7
            }
            nisbet = b / c;
            System.out.println(df.format(nisbet));
        }
    }
}
