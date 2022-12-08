package Eolymp;

import java.util.Scanner;

public class Eolymp8859 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt(); // 123
        int a;
        int b;
        int c;

        a=n%100; // 23
        a=a/10; // 2
        b=n/100; //1
        c=n%10; // 3
        n=(a*10+b)*10+c;

        System.out.println(n);
    }
}
