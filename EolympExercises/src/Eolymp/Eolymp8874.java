package Eolymp;

import java.util.Scanner;

public class Eolymp8874 {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();


            n=Math.abs(n);

            if (n>=10 && n<=99){
                System.out.println("Ok");
            }else {
                System.out.println("No");
            }
        }
    }


