package Eolymp;

import java.util.Scanner;

public class Eolymp951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int c;
        int d=0;
        int i;

        if (a > 0) { // 4567
            b = a % 1000; // 567
            b = b / 10; // 56
            a = a - b*10; // 4007

            for (i = 2; i > 0; i--) {
                c = b % 10; // 6
                b = b / 10; // 5
                d = d * 10 + c; // 6 65

            }
            d = a + d * 10;
            System.out.println(d);
        }
    }
}
