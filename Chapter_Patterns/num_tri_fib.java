package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class num_tri_fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a =0 ;
        int b = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println("");
        }
    }
}
