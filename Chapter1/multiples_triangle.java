package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class multiples_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 1; i <=c; i++) {
            int num = 5 * i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num -= i;
            }
            System.out.println();
        }

    }
}

