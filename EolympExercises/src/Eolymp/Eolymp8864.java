package Eolymp;

import java.util.Scanner;

public class Eolymp8864 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if((n!=0 && n<=1000000*1000) &&(m!=0 && m<=1000000*1000)){
            if((n>0 && m>0) ||(m<0 && n<0)){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
