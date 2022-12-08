package Eolymp;

import java.util.Scanner;

public class Eolymp8857 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;
        int b;
        int c;

        a=n%10; // 3
        b=n/100; // 1
        c=n-(b*100+a);
        b=(b*10+a)*10+c/10;

        System.out.println(b);
    }
}
