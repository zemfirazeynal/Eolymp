package Eolymp;

import java.util.Scanner;

public class Eolymp8850 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;
        int sum=0;
        int i;

        for(i=1;i<=3;i++){
            a=n%10;
            n=n/10;
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
