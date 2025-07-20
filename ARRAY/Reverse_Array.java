package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Reverse_Array {

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void arr_reverse(int[] arr, int n){
        int i = 0;int j = n-1;
        while(i < j){
            swap(i, j, arr);
            i++;j--;
        }
    }

    public static void arr_disp(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of The Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        arr_disp(arr, n);
        System.out.println();
        arr_reverse(arr, n);
        arr_disp(arr, n);
    }
}
