package JAVA_DSA.Number_System;

import java.util.Scanner;

public class any_base_subtrn {

    public static int subtraction(int base, int num1, int num2){
        int subtraction = 0;
        int r1;
        int r2;
        int c = 0;
        int p = 1;
        while(num1 > 0 || num2 > 0){
            r1 = num1 % 10;r2 = num2 % 10;
            num1 /= 10; num2 /= 10;

            r2 +=c;

            int d;
            if(r2 >= r1){
                c = 0;
                d = r2 - r1;
            }else {
                c = -1;
                d = r2 + base -r1;
            }
            subtraction += d * p;
            p *= 10;
        }


        return subtraction;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = subtraction(base, num2, num1);
        System.out.println("Subtraction of "+num1+" and "+num2+" is:  "+sum);
    }
}
