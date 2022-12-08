package Eolymp;

import java.util.Scanner;

public class Eolymp935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int c = 100;
        int i;

        if (a != 0) {
            if (a < 0) {
                a = (-1) * a;
            }
            for (i = 3; i > 0; i--) { // 189
                b = a / c; // 1 8
                a = a - c * b; // 189-100 89-80
                c = c / 10; // 100/10  10/10
                System.out.println(b);
            }
        }
    }
}
