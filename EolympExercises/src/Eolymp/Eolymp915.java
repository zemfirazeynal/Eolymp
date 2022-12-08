package Eolymp;

import java.util.Scanner;

public class Eolymp915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > 0 && a <= 1000) && (b > 0 && b <= 1000) && (c > 0 && c <= 1000)) {
            if ((c * c == a * a + b * b) || (a * a == b * b + c * c) || (b * b == a * a + c * c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
