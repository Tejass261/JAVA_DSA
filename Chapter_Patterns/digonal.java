package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class digonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spl =0 ;
        int spr =n-1 ;
        int st =1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=spl;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=spr;j++){
                System.out.print("\t");
            }

            spl++;
            spr--;
            System.out.println("");
        }
    }
}
