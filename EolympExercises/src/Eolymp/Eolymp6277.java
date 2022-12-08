package Eolymp;

import java.util.Scanner;

public class Eolymp6277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double bb = 0.20;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        if (n1 >= 1 || n1 <= 1000) {
            while (n1 >= 1.20 && n1 <= 1000) {  // 1000
                n1 = (n1 - 1.20); // 0.4
                count1 = count1 + 1; //833 su şüşəsi içildi
                n2 = count1 * bb + n1; // 167 manat
            }
            while (n2 >= 1.20) { // 167
                n2 = (n2 - 1.20);// 0.2
                count2 = count2 + 1; // 139 su şüşəsi içildi.
                n3 = count2 * bb + n2; // 28 manat
            }
            count1 = count1 + count2; // 833+139=972

            while (n3 >= 1.20) { // 28
                n3 = (n3 - 1.20); // 0.4
                count3 = count3 + 1; // 23 su şüşəsi içildi.
                n4 = count3 * bb + n3; // 5 manat
            }
            count1 = count1 + count3;

            while (n4 >= 1.20) { // 5
                n4 = (n4 - 1.20); // 0.2.
                count4 = count4 + 1; // 4 su şüşəsi içildi
            }
            count1 = count1 + count4;
        }
        System.out.println(count1);
    }
}
