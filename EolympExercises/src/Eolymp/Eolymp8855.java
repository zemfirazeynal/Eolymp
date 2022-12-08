package Eolymp;

import java.util.Scanner;

public class Eolymp8855 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int t;
        int q;
        int x;

        q=n%10;
        t=n/10;
        x=q*100+t;

        System.out.println(x);

    }
}
