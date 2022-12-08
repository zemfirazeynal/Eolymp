package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp921 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        double[] a = new double[h];
        int c = 0;
        double s = 0;

        if (h >= 1 && h <= 100) { // 5
            for (int i = 0; i < h; i++) { //
                a[i] = sc.nextDouble();
                if (a[i] < 0) {
                    s = s + a[i];
                    c = c + 1;
                }
            }
            System.out.println(c + " " + df.format(s));
        }
    }
}
