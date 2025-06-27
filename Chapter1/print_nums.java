package JAVA_DSA.Chapter1;

import java.util.Scanner;
public class print_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int len = count_num.countDigits(x);

        int div = (int)Math.pow(10, len-1);
        while(div != 0){
            int p = x/div;
            System.out.print(p+" ");

            x = x % div;
            div = div/10;
        }
    }
}
