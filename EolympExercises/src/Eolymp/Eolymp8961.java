package Eolymp;

import java.util.Scanner;

public class Eolymp8961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        int j;
        int b;
        int min = 0;

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
            } else {
                min = a[i];
                for (j = 0; j < n; j++) {
                    if (a[j] < min) {
                        min = a[j];
                    }


                }
            }

        }
        for (i = 0; i < n; i++) {
            if (a[i] == min) {
                b = a[i];
                a[i] = a[0];
                a[0] = b;
            }

        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i]+" ");

        }
    }
}
