package Eolymp;

import java.util.Scanner;

public class Eolymp903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 99 && a < 1000) {
            int b = a / 100;
            int c = a % 10;
            if (b > c) {
                System.out.println(b);
            } else if (b < c) {
                System.out.println(c);
            } else {
                System.out.println("=");
            }
        }
    }
}
