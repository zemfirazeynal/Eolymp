package Eolymp;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Eolymp957 {
    private static final DecimalFormat df = new DecimalFormat("0.000");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b;
        double c=0;
        int i;
        if(a!=0){
            for(i=3; i>0; i--){
                b=a%10;
                a=a/10;
                c=c+b;
            }
            c=Math.sqrt(c);
            df.setRoundingMode(RoundingMode.UP);
            System.out.println(df.format(c));
        }
    }
}
