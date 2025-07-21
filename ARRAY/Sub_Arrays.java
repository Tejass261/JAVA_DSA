package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Sub_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter The Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int a = arr[0];
        int b = arr[n-1];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
