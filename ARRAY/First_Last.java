package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int low = 0, high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == target) {
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        while(arr[low] == target) low -= 1;
        while(high == target) high += 1;
        System.out.println("Low: " + low + ", High: " + high);
    }
}