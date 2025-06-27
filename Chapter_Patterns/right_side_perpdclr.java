package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class right_side_perpdclr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int space = x-1; int star = 1;
        for (int i=1;i<=x;i++){

            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }

            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }

            space--;
            star++;
            System.out.println("");
        }
    }
}
