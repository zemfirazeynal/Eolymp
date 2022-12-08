package Eolymp;

import java.util.Scanner;

public class Eolymp8865 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n != 0 && m != 0) {
                if ((Math.abs(n) % 2 == 1 && Math.abs(m) % 2 == 1) || (Math.abs(n) % 2 == 0 && Math.abs(m) % 2 == 0)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
}
