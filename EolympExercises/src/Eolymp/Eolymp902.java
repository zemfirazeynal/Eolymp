package Eolymp;

import java.util.Scanner;

public class Eolymp902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        switch (n) {
            case 1:
            case 2:
            case 3:
                System.out.println("Initial");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Average");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Sufficient");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("High");
                break;
        }
    }
}
