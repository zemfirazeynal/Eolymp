package Eolymp;

import java.util.Scanner;

public class Eolymp8892_ {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int a;
        int count=0;
        int b=100;
        int c=0;

        /*for(i=3;i>0;i--){
            n=n/b;
            b=b/10;
            count++;
            c=n+c*10;
        }
        System.out.println(c);

         */

        if(n % 2 !=1 && n < 0 && n /100 != 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
