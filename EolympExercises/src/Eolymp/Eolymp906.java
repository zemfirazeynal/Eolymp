package Eolymp;

import java.util.Scanner;

public class Eolymp906 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int c = 1;

        if (a <= 999) { // 345
            for (int i = 1; i < 4; i++) { // 0 1 2
                b = a % 10; // 5 4 3
                c = c * b; // 5 20 60
                a = a / 10; // 34 3 0
            }
            System.out.println(c);
        }
    }
}
