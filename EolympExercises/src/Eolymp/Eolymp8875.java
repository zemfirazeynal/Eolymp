package Eolymp;

import java.util.Scanner;

public class Eolymp8875 {

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();


            n=Math.abs(n);

            if (n>=100 && n<=999){
                System.out.println("Ok");
            }else {
                System.out.println("No");
            }
        }
    }



