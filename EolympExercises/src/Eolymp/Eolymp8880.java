package Eolymp;

import java.util.Scanner;

public class Eolymp8880 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(a>0 && b>0 && c>0) {
            if (a == c && b == c) {
                System.out.println(a * a);
            } else {
                System.out.println("No");
            }
        }
    }
}