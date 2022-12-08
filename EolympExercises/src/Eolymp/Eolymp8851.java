package Eolymp;

import java.util.Scanner;

public class Eolymp8851 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;
        int b=0;
        int i;

        for(i=1;i<=4;i++){
            a=n%10;
            n=n/10;
            b=b*10+a;
        }
        System.out.println(b);
    }
}
