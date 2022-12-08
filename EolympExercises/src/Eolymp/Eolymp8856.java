package Eolymp;

import java.util.Scanner;

public class Eolymp8856 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;

        a=n%100;
        n=n/100;
        n=a*10+n;
        System.out.println(n);
    }
}
