package Eolymp;

import java.util.Scanner;

public class Eolymp8954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int i;
        int j;

        if (n <= 100) {

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (j = n-1; j >=0; j--) {
                System.out.print(a[j] + " ");
            }


        }
    }}
