package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp934 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double ha;
        double hb;
        double hc;
        double p;
        double s;

        if ((a != 0 && (a >= -100 && a <= 100)) && (b != 0 && (b >= -100 && b <= 100)) && (c != 0 && (c >= -100 && c <= 100))) {
            p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            ha = 2 * s / a;
            hb = 2 * s / b;
            hc = 2 * s / c;
            System.out.println(df.format(ha) + " " + df.format(hb) + " " + df.format(hc));
        }
    }
}
