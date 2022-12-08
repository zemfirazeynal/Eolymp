package Eolymp;

import java.util.Scanner;

public class Eolymp8953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;

        if (n >= 1 && n <= 100) {
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                System.out.println(a[i]);
            }
        }
    }
}
