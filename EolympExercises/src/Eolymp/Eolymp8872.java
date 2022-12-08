package Eolymp;

import java.util.Scanner;

public class Eolymp8872 {

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min;
            int max;

            if(a>b){
               min = Math.min(b,c);
               max = Math.max(b,c);
               System.out.println(min+" "+max+" "+a);
            }else{
                    min = Math.min(a,c);
                    max = Math.max(a,c);
                    System.out.println(min+" "+max+" "+b);
                }
            }


        }


