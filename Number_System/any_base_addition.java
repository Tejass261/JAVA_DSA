package JAVA_DSA.Number_System;

import java.util.Scanner;

public class any_base_addition {

    public static int addition(int base, int num1, int num2){
        int sum = 0;
        int r1 = 0;
        int r2 = 0;
        int p = 1;
        int c = 0;

            while(num1 > 0 || num2 >0 || c > 0) {
                r1 = num1 % 10;
                r2 = num2 % 10;
                num1 /= 10;
                num2 /= 10;
                sum += ((c +r1 + r2) % base) * p;
                c = (r1 + r2) / base;
                p *= 10;
            }


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = addition(base, num1, num2);
        System.out.println("Sum of "+num1+" and "+num2+" is:  "+sum);
    }
}
