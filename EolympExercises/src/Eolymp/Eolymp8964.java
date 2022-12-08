package Eolymp;

import java.util.Scanner;

public class Eolymp8964 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a= new int[n];
        int i;
        int j;
        int max =0;
        int maxsay=0;

        for(i=0; i<n; i++){
            a[i]= sc.nextInt();
            if(a[i]>max){
                max =a[i];
            }else{
                max=a[i];
                for(j=0; j<n;j++){
                    if(a[j]>max){
                        max = a[j];
                    }
                }
            }
        }


        for(i=0; i<n;i++){
            if(a[i]!=max){
                System.out.print(a[i]+" ");
            }
        }
        for(i=0;i<n; i++){
            if(a[i]==max){
                System.out.print(max+" ");
            }
        }
    }
}
