package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp907 {
    private final static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        boolean b = false;
        int i;

        if (n > 0 && n <= 100) {
            for (i = 0; i < a.length; i++) {
                a[i] = sc.nextDouble();
                if (a[i] <= 2.5) {
                    System.out.println(i + 1+" " + df.format(a[i]));
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.println("Not Found");
            }
        }
    }
}
