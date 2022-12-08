package Eolymp;

import java.util.Scanner;

public class Eolymp943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b = 0;
        int i;

        if (n != 0) {
            if (n < 0) {
                n = n * (-1);
            }
            for (i = 3; i > 0; i--) { // 198
                a = n % 10; // 8 9 1
                n = n / 10; // 19 1 0
                b = b * 10 + a; // 8 89 891
            }
            System.out.println(b);
        }
    }
}
