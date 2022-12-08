package Eolymp;

import java.util.Scanner;

public class Eolymp959 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int c;

        if(a>0){
            if(a>=1000 && a<=9999){
                b=a%10;
                a=a/1000;
                c=a+b;
                System.out.println(c);
            }
        }
    }
}
