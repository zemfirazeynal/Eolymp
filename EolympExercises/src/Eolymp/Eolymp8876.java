package Eolymp;

import java.util.Scanner;

public class Eolymp8876 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        n=Math.abs(n);

        if(n-(int)n==0){
            System.out.println("Ok");
        }else {
            System.out.println("No");
        }
    }
}