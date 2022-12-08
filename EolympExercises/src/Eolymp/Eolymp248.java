package Eolymp;

import java.util.Scanner;

public class Eolymp248 {
    public static void main(String [] args){

            Scanner sc = new Scanner(System.in);

            int y = sc.nextInt();
            int a=1;

            int c=0;
            while(y>0){ // 2
                y--; // 1
                c++; // 1
                a=a+c*2;// 3
            }
            System.out.println(a);
        }
    }

