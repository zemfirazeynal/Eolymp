package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp112 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        double t3 = sc.nextDouble();
        double b;

        if (t1 <= 10000 && t2 <= 10000 && t3 <= 10000) {
            b = 1 / (1 / t1 + 1 / t2 + 1 / t3);
            System.out.println(df.format(b));
        }
    }
}
