package Eolymp;

import java.util.Scanner;

public class Eolymp8882 {

            public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();


            if((a>0 && b>0 && c>0) && (a<=1000000*1000 && b<=1000000*1000 && c<=1000000*1000)) {
                if (a == b && a == c && a==d) {
                    System.out.println(a * a);
                } else {
                    System.out.println("No");
                }
            }

        }
    }

