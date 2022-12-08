package Eolymp;

import java.util.Scanner;

public class Eolymp8853 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int i;
        int a;
        int b=0;
        int c=1;

        for(i=1;i<=5;i++){ // 12345

            a=n%10;
            n=n/10;
            if(i%2==0){
                b=c*a+b;
                c=c*10;
            }
        }
        System.out.println(b);
    }
}
