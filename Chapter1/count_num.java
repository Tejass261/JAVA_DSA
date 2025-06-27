package JAVA_DSA.Chapter1;

import java.util.Scanner;
public class count_num {
    public static int countDigits(int x) {
        int count = 0;
        if (x == 0) return 1;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(countDigits(x));
    }
}
