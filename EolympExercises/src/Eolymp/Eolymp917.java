package Eolymp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp917 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); //3
        double[] a = new double[h]; // 5 0 -7 -3
        int i;
        double min = 0;

        if (h > 0 && h <= 100) {
            for (i = 0; i < h; i++) { // 1(5) 2(0) 3(-7) 4(-3)

                a[i] = sc.nextDouble();
                if (a[i] < min) {
                    min = a[i];
                } else {
                    min = a[i];
                    for(int j=0; j<h;j++ ){
                        if (a[j] < min) {
                            min = a[j];
                        }
                    }
                }
            }
            System.out.println(df.format(2 * min));
        }
    }
}
