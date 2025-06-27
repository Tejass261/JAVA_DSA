package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class pythogorean_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = x;

        if(y>max) max =y;
        if(z>max) max =y;

        if(max == x){
            boolean flag = (y*y + z*z == x*x);
            System.out.println(flag);
        }
        if(max == y){
            boolean flag = (x*x + z*z == y*y);
            System.out.println(flag);
        }
        if(max == z){
            boolean flag = (y*y + x*x == z*z);
            System.out.println(flag);
        }
    }
}
