package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Differ_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] diff = new int[m];
        int carry = 0;

        int i = arr.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        //incomplete


        if(carry != 0) System.out.println(carry);
        for(int val: diff){
            System.out.println(val);
        }
    }
}
