package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class num_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println("");
        }
    }
}
