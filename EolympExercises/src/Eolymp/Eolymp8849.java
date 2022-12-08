package Eolymp;

import java.util.Scanner;

public class Eolymp8849 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int a;
        int b=0;
        int c=1;


        for(i=1;i<=2;i++){
            a=n%10;
            n=n/10;
            b=c*11*a+b;
            c=c*100;
        }
        System.out.println(b);
    }
}
