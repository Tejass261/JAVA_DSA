package JAVA_DSA.Chapter_functions;

import java.util.Scanner;

public class factorial {

    public static int factorial(int n, int r){
        int fact = 1;
        int n2 = n;

        for (int i = r; i > 0; i--) {
            fact *= n2;
            n2 -= 1;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int fact = factorial(n, r);
        System.out.println(fact);
    }
}
