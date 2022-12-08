package Eolymp;

import java.util.Scanner;

public class Eolymp911 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d;
        int x1;
        int x2;

        if (a != 0 && (a >= -100 && a <= 100) && (b >= -100 && b <= 100) && (c >= -100 && c <= 100)) {
            d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("No roots");
            } else if (d == 0) {
                x1 = ((-1) * (b)) / (2 * a);
                System.out.println("One root:" + " " + x1);
            } else {
                x1 = (int) (((-1) * (b) - Math.sqrt(d)) / (2 * a));
                x2 = (int) (((-1) * (b) + Math.sqrt(d)) / (2 * a));
                if (x1 < x2) {
                    System.out.println("Two roots:" + " " + x1 + " " + x2);
                } else {
                    System.out.println("Two roots:" + " " + x2 + " " + x1);
                }
            }
        }
    }
}
