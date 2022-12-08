package Eolymp;

import java.util.Scanner;

public class Eolymp8866 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if(a%b==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
