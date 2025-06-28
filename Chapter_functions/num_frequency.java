package JAVA_DSA.Chapter_functions;

import java.util.Scanner;

public class num_frequency {


    public static void frequency(int num, int x){
        int freq = 0;
        int orig = num;
        int digit = 0;
        while(num != 0){
            digit = num%10;
            num = num/10;
            if(x == digit){
                freq++;
            }
        }

        System.out.println("The frequency of "+ x + " in "+ orig + " is " +freq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        frequency(num,x);
    }
}
