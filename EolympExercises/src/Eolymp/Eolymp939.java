package Eolymp;

import java.util.Scanner;

public class Eolymp939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b = 0;
        int i;

        if (n > 0) { // 23
            for (i = 2; i > 0; i--) {
                a = n % 10; // 3 2
                n = n / 10; // 2 0
                b = (b + a); // 3 5
            }
            b = b * b;
            System.out.println(b);
        }
    }
}
