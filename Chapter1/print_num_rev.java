package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class print_num_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x > 0){
            int p = x%10;
            System.out.print(p+" ");
            x = x/10;
        }
    }
}
