package Eolymp;

import java.util.Scanner;

public class Eolymp8890 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int a;
        int b=10000;
        int c=0;


        for(i=5;i>0;i--) {
            a= n / b;
            n=n-a*b;
            b=b/10;
            if (a % 2 == 0) {
                a=a+1;
            }
            c=a+c*10;
        }
        System.out.println(c);
    }
}
