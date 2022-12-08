package Eolymp;

import java.util.Scanner;

public class Eolymp904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] >= 0) {
                a[i] = a[i] + 2;
            } else {
                a[i] = a[i];
            }
            System.out.print(a[i] + " ");
        }
    }
}
