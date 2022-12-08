package Eolymp;

import java.util.Scanner;

public class Eolymp8889 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int i;
            int a;
            int count =0;

            for(i=5;i>0;i--) {
                a = n % 10;
                n = n / 10;
                if (a % 2 == 1) {
                    count++;
                }
            }
                System.out.println(count);
            }
        }

