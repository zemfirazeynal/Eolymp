package Eolymp;

import java.util.Scanner;

public class Eolymp9400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        int i;
        int j;

        if (n >= 2 && n <= 50) { // 3
            for (i = 1; i<= n; i++) {
                for (j = 1; j <= a; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
                a++;

            }
        }
    }
}
