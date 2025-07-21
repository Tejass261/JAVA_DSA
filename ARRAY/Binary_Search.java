package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int len = sc.nextInt();
        System.out.print("Enter Target: ");
        int target = sc.nextInt();


        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter The Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int low = 0, high = arr.length - 1;
        int mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println();
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("Not found");
        }

    }
}
