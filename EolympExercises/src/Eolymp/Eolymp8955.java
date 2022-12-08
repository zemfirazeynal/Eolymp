package Eolymp;

import java.util.Scanner;

public class Eolymp8955 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        int i;
        int j;

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                count++;
            }
        }
        if(count!=0){
            System.out.println(count);
        }
        for (j = 0; j < n; j++) {
            if (a[j] > 0) {

                System.out.print(a[j] + " ");
            }

        }
        if(count==0){

            System.out.println("NO");
        }

    }
}
