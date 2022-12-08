package Eolymp;

import java.util.Scanner;

public class Eolymp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b;

        if (n >= 10 && n <= 99) {
            a = n / 10;
            b = n % 10;
            System.out.println(a + " " + b);
        }
    }
}
