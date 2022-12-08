package Eolymp;

import java.util.Scanner;

public class Eolymp8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        int count = 0;
        int j;


        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i % 2 == 1) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("NO");
        }
        for (j = 0; j < n; j++) {
            if (j % 2 == 1) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
