package Eolymp;

import java.util.Scanner;

public class Eolymp108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 0 && b < 0 && c < 0) {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        if (a <= 1000 && b <= 1000 && c <= 1000) {
            if ((a > b && b > c) || (c > b && b > a)) {
                System.out.println(b);
            } else if ((a > c && c > b) || (b > c && c > a)) {
                System.out.println(c);
            } else if ((c > a && a > b) || (b > a && a > c)) {
                System.out.println(a);
            }
        }
    }
}
