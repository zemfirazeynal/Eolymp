package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp920 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double a;
        double b;
        double c;

        if ((x >= -100 && x <= 100) && (y >= -100 && y <= 100) && (z >= -100 && z <= 100)) {
            a = Math.max(x, y);
            b = Math.max(x, y);
            c = x + y + z;
            a = Math.min(a, b);
            a = Math.min(a, c);
            System.out.println(df.format(a));
        }

    }
}
