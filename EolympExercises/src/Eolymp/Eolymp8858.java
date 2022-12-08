package Eolymp;

import java.util.Scanner;

public class Eolymp8858 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int a;
        int b=0;

        for(i=0; i<3; i++){// 123
            a=n%10; // 3 2 1
            n=n/10; // 12 1 0
            b=b*10+a; // 3 32 321

        }
        System.out.println(b);
    }
}
