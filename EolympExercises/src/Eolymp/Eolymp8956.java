package Eolymp;

import java.util.Scanner;

public class Eolymp8956 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        int j;
        int count = 0;

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("NO");
        }
        for (j = n - 1; j >= 0; j--) {
            if (a[j] < 0) {
                System.out.print(a[j] + " ");
            }
        }
    }
}

