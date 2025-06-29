package JAVA_DSA.Number_System;

import java.util.Scanner;

public class any_base_to_decimal {

    public static int to_decimal(int choice, int num){
        int decimal_num = 0;
        int p = 1;
        if (choice == 2) {
            while(num != 0){
                decimal_num += (num%10)*p;
                p *= 2;
                num /=10;
            }
        } else if (choice == 10) {
            while(num != 0){
                decimal_num += (num%10)*p;
                p *= 8;
                num /=10;
            }
        } else {
                return -1;
               }

        return decimal_num;
    }

    public static void main(String[] args) {
        System.out.print("Enter 2 to Binary Input and 10 for Octal Input: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int decimal_num = to_decimal(choice, num);
        if (decimal_num == -1){
            System.out.println("Invalid Number");
        }else
            System.out.println("Decimal Number is: "+decimal_num);
    }
}
