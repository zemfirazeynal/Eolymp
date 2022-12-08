package Eolymp;

import java.util.Scanner;

public class Eolymp961 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;

        if(a>0){
            if(a>=1000 && a<=9999){
                b=a%10;
                a=a/1000;
                a=a*10+b;
                System.out.println(a);
            }
        }
    }
}
