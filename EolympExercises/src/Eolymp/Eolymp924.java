package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp924 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sh = sc.nextDouble();
        double r1 = sc.nextDouble();
        double s;

        double r2;
        double pi = 3.141592;

        if (r1 <= 100) {
            s = pi * r1 * r1;
            s = s - sh;
            r2 = Math.sqrt(s / pi);

            System.out.println(df.format(r2));

        }
    }
}
