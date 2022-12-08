package Eolymp;

import java.util.Scanner;

public class Eolymp8852 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int a;
        int b=0;
        int c=1;

        for(i=1;i<=5;i++){
            a=n%10;
            n=n/10;
            if(i%2==1){
                b=c*a+b;
                c=c*10;
            }
        }
        System.out.println(b);
    }
}
