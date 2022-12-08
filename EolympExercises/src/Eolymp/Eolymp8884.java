package Eolymp;

import java.util.Scanner;

public class Eolymp8884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();


        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if ((a == b && a + b > c)||  (a == c && a + c > b) ||  (c == b && c + b > a)) {
            System.out.println("isosceles");
        } else if (a + b > c && a + c > b && c + b > a) {
            System.out.println("versatile");
        } else {
            System.out.println("invalid");
        }
    }
}