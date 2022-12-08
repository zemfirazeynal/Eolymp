package Eolymp;

import java.util.Scanner;

public class Eolymp8959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        int j;
        int k;
        int f;
        int min = 0;
        int max = 0;

        if (n >= 1 && n <= 100) {

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

            for (k = 0; k < n; k++) {
                if (a[k] > max) {
                    max = a[k];
                } else {
                    max = a[k];
                    for (f = 0; f < n; f++) {
                        if (a[f] > max) {
                            max = a[f];
                        }
                    }
                }
            }
            System.out.println(max-min);
        }
    }
}
