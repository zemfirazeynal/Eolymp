package Eolymp;

import java.util.Scanner;

public class Eolymp929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
