package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp919 {
    private final static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3 1 2 3 4
        double[] a = new double[n+1];


        double sum = 0;
        int count = 0;

        if (n>0 && n <= 100) {
            for (int i = 1; i <=n; i++) {    //
                a[i] = sc.nextDouble();

                if (a[i] > 0) {
                    if (i % 3 == 0) {
                        sum = sum + a[i];
                        count = count + 1;
                    }
                }
            }
            System.out.println(count + " " + df.format(sum));
        }
    }
}
