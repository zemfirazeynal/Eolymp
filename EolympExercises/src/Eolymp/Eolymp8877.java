package Eolymp;

import java.util.Scanner;

public class Eolymp8877 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m= (int) Math.sqrt(n);
        if(m-Math.sqrt(n)==0){
            System.out.println(m);
        }else{
            System.out.println("No");
        }

    }
}
