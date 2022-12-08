package Eolymp;

import java.util.Scanner;

public class Eolymp8860 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;
        int b;
        int c;
        int sum =0;

            a=n/100; // 1
            n=n-a*100;// 23
            b=n/10; // 2
            c=n-b*10; // 3
            sum=(1+10+100)*(2*a+2*b+2*c);
            System.out.println(sum);

        }
    }
