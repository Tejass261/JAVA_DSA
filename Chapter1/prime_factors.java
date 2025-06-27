package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 2; i*i <= x; i++){
            while(x % i == 0){
                System.out.println(i);
                x = x/i;
            }
        }
        if(x != 1){
            System.out.println(x);
        }
    }
}
