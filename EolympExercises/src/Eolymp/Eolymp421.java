package Eolymp;

import java.util.Scanner;

public class Eolymp421 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        int k = sc.nextInt();
        int d = 0;

        if (2 <= k && k <= 100) {
            while (1 <= l && l <= 1000000 * 1000) {
                l = l / k; //  8.5, 4.25, 2.125, 1.0625
                if (1 < l) {
                    d = d + 1; // 1, 2, 3, 4, 5
                }
            }
            System.out.println(d);
        } else {
            System.out.println(false);
        }
    }
}
