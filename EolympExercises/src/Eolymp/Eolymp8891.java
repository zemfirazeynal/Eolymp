package Eolymp;

import java.util.Scanner;

public class Eolymp8891 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0 && n > 0 && n % 3 != 0){
            System.out.println("YES");
        }else if(n%2!=0 && n<0 && n%3==0){
            System.out.println("YES");
        }else if(n==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
