package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class benjamin_bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i*i<n ; i++){
            System.out.print("B"+i*i+" ");
        }
    }
}
