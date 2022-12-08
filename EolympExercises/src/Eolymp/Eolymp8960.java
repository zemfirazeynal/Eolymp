package Eolymp;

import java.util.Scanner;

public class Eolymp8960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        int j;
        int k;

        int sum = 0;
        int min = 0;
        int max = 0;

        if (n>0 && n<=100) {
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > max) {
                    max = a[i];
                }
            }

            for (j = 0; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                } else {
                    min = a[j];
                    for (k = 0; k < n; k++) {
                        if (a[k] < min) {
                            min = a[k];
                        }
                    }
                }
            }
            for(i=0;i<n;i++){
                if(a[i]!=max && a[i]!=min){
                    sum=sum+a[i];
                }

            }


            System.out.println(sum);
        }
    }
}
