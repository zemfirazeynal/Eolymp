package Eolymp;

import java.util.Scanner;

public class Eolymp8879 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(a + b + c);
        } else if ((a == b & c <= a) || (a == c && b <= a) || (c == b && a <= c)) {
            System.out.println(a + b + c);
        } else if ((a > b && a > c && c + b > a) || ((b > a && b > c && c + a > b)) || (c > b && c > a && a + b > c)) {
            System.out.println(a + b + c);
        } else {
            System.out.println("No");
        }
    }
}