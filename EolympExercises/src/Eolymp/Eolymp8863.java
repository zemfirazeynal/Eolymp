package Eolymp;

import java.util.Scanner;

public class Eolymp8863 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            n=Math.abs(n);
        }

        if ( n % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}