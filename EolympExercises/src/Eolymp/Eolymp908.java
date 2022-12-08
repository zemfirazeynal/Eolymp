package Eolymp;

import java.util.Scanner;

public class Eolymp908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int count = 0;

        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > 0 && a[i] % 2 == 0 && a[i] % 3 == 0) {
                    count++;
                    sum = sum + a[i];
                }
            }
            System.out.println(count + " " + sum);
        }
    }
}
