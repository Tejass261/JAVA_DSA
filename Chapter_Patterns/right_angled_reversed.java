package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class right_angled_reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
