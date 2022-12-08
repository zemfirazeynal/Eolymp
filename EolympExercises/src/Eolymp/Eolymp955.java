package Eolymp;

import java.util.Scanner;

public class Eolymp955 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int c=0;
        int i;

        if(a>0){
            for(i=4; i>0; i--){
                b=a%10;
                a=a/10;
                c=c+b;
            }
            c=c*c;
            System.out.println(c);
        }
    }
}
