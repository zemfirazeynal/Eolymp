package Eolymp;

import java.util.Scanner;

public class Eolymp953 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b;
        int q;

        if(a>0){
            if(a>=100 && a<=999){
                b=a%10; // 8
                a=a/100; //1
                q=b%a;
                System.out.println(q);
            }
        }
    }
}
