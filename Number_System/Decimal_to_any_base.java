package JAVA_DSA.Number_System;

import java.util.Scanner;

public class Decimal_to_any_base {

    public static int dec_to_bin(int decimal_num){
        int binary_num = 0;
        int p = 1;
        while(decimal_num !=0){
            binary_num += (decimal_num%2)*p;
            decimal_num /= 2;
            p*=10;
        }

        return binary_num;
    }

    public static int dec_to_oct(int decimal_num){
        int octal_num = 0;
        int p = 1;
        while(decimal_num !=0){
            octal_num += (decimal_num%8)*p;
            decimal_num /= 8;
            p *= 10;
        }

        return octal_num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();

        int binary_num =dec_to_bin(decimal_num);
        System.out.println("Binary number for "+decimal_num+" is "+binary_num);
        int octal_num =dec_to_oct(decimal_num);
        System.out.println("Octal number for "+decimal_num+" is "+octal_num);
    }
}
