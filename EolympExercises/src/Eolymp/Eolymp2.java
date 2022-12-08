package Eolymp;

import java.util.Scanner;

public class Eolymp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if (n != 0) {
            while (n > 0 && n <= 2 * 1000000 * 1000) { // 7890
                n = n / 10; // 789, 78, 7, 0.
                count = count + 1; // 1, 2, 3, 4.
            }
            System.out.println(count);
        } else {
            System.out.println(1);
        }
    }
}
