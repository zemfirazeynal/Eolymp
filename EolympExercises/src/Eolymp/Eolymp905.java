package Eolymp;

import java.util.Scanner;

public class Eolymp905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > 0 && a <= 100) && (b > 0 && b <= 100) && (c > 0 && c <= 100)) {
            if (a == b && b == c) {
                System.out.println("1");
            } else if (a == b || b == c || a == c) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
