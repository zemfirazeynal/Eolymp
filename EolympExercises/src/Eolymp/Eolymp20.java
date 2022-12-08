package Eolymp;

import java.util.Scanner;

public class Eolymp20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int c = 0;
        int a;
        int n2;

        while (n > 0) {
            n2 = n;
            while (n2 > 0) { // 25, 18, 9
                a = n2 % 10; //  5 2, 8 1, 9
                n = n / 10; //  2 0, 1 0, 0
                c = c + a; // 7, 9, 9
            }
            n = n - c; // 18, 9, 0
            c = 0;
            count = count + 1; // 1, 2, 3
        }
        System.out.println(count);
    }
}
