package Eolymp;

import java.util.Scanner;

public class Eolymp110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = a;
        int pow = 0;

        while (n > 1) {
            n = n / 2;
            pow++;
        }

        if (n % 2 == 0) {
            System.out.println(0);
        } else {
            a = (int) (a - Math.pow(2, pow));
        }
        System.out.println(a);
    }
}
