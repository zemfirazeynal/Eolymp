package Eolymp;

import java.util.Scanner;

public class Eolymp8883 {

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();


            if((a==d && b==c) || (a==b && d==c) ||(a==c && b==d) ) {
                    System.out.println(a+b+c+d);
                } else {
                    System.out.println("No");
                }
            }

        }
