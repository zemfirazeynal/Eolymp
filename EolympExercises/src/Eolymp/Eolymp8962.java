package Eolymp;

import java.util.Scanner;

public class Eolymp8962 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int [] a = new int [n];
        int i;
        int j;
        int b=0;
        int c;
        int max=0;

        for(i=0;i<n; i++){
            a[i]= sc.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        for(j=0;j<n;j++){
            if(a[j]==max){
                max=a[j];
                b=j;
            }

        }
        for(i=0; i<n;i++) {

            if(a[i]==a[b] && i==b){
                c=a[n-1];
                a[n-1]=a[b];
                a[b]=c;
            }
            System.out.print(a[i] + " ");

        }
    }
}
