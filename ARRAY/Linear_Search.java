package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter Number To Be Searched: ");
        int s = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == s){
                System.out.println("Element found at index: " + i);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Element Not In The List");
        }
    }
}
