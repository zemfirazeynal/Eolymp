package Eolymp;

import java.util.Scanner;

public class Eolymp8881 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();

        if(a==b && a+b>c || a==c && a+c>b || b==c && b+c>a){
            System.out.println(a+b+c);
        } else {
            System.out.println("No");
        }
    }
}
