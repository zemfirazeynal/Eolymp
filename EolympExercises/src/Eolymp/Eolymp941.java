package Eolymp;

import java.util.Scanner;

public class Eolymp941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int c = 1;
        int d = 0;
        int f;
        int i;

        if (a != 0) {
            if (a < 0) {
                a = (-1) * a;
            }
            for (i = 3; i > 0; i--) {
                b = a % 10;
                a = a / 10;
                c = c * b;
                d = d + b;
            }
            f = c - d;
            System.out.println(f);
        }
    }
}
