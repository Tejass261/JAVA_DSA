package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Inverse_Array {

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int p;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            p = arr[i];
            arr2[p] = i;
        }
        display(arr);
        System.out.println();
        display(arr2);
    }
}
