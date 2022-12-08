package Eolymp;

import java.util.Scanner;

public class Eolymp8963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        int j;
        int minsay=0;
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
                minsay++;
            }
        }

        for (i = 0; i < n; i++) {
            if (a[i] == min) {
                System.out.print(min + " ");
            }
        }
        for (i = 0; i < n; i++) {
            if (a[i] != min) {
                System.out.print(a[i] + " ");
            }


        }
    }
}
