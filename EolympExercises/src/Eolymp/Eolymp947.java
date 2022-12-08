package Eolymp;

import java.util.Scanner;

public class Eolymp947 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int i;

        if(a>=100 && a<=999){
            for(i=3;i>0;i--){
                b=a%10;
                a=a/10;
                System.out.print(b);
            }
        }
    }
}
