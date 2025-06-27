package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class gcd_lcm {

    public static int gcd(int x, int y){
            while(y !=0){
                int temp = x%y;
                x = y;
                y = temp;
            }
            return x;
    }

    public static int lcm(int x, int y, int z){
        int lcm = (x*y)/z;
        return lcm;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b,gcd(a,b)));
    }
}
