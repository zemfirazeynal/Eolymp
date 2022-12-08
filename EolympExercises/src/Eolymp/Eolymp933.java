package Eolymp;

import java.util.Scanner;

public class Eolymp933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int c = 0;
        int i;

        if (a != 0) {
            if (a < 0) {
                a = (-1) * a;
            }
            if ((a >= 10 && a < 100)) // 87
                for (i = 2; i > 0; i--) {
                    b = a % 10; //7 8
                    a = a / 10; // 8 0
                    c = c + b; // 7 15
                }
            System.out.println(c);
        }
    }
}
