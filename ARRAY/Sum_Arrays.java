package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Sum_Arrays {
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

        int[] sum = new int[Math.max(m, n)];
        int carry = 0;

        int i = arr.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0){
            int d = carry;

            if(i >= 0) d+= arr[i];
            if(j >= 0) d+= arr2[j];

            carry = d/10;
            sum[k] = d%10;

            i--;j--;k--;

        }
        if(carry != 0) System.out.println(carry);
        for(int val: sum){
            System.out.println(val);
        }
    }
}
