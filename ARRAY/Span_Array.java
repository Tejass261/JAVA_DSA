package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Span_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int  i = sc.nextInt();

        int arr[] = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.print("Enter Element " + j + ": ");
            arr[j] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("Difference of max and min element of array is: " + (max-min));
    }
}
