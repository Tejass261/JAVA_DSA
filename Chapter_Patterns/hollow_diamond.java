package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class hollow_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 1;
        int st = n/2+1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }

            if (i<=n/2){
                sp+=2;
                st-=1;
            } else {
                st+=1;
                sp-=2;
            }

            System.out.println("");
        }
    }
}
