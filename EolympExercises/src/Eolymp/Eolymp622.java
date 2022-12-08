package Eolymp;

import java.util.Scanner;

public class Eolymp622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int count = 0;

        while (n > 0 && n <= 2 * 1000000 * 1000) { //19 9 4 2
            a = n % 2; // 1 1 0 0
            n = n / 2; // 9 4 2 1
            if (a == 1) {
                count = count + 1;
            } else {
                count = count + 0;
            }
        }
        System.out.println(count);
    }
}
