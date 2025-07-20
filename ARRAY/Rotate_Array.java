package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Rotate_Array {

    public static void reverse(int[] arr, int i, int j) {
       int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Rotation Number: ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int x = arr.length;
        k %= x;
        if(k < 0) k += x;

        reverse(arr,0,x-k-1 );
        reverse(arr,x-k,x-1);
        reverse(arr,0,x-1);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

    }
}
