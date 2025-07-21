package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Ceil_and_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i +": ");
            arr[i] = sc.nextInt();
        }

        int low = 0, high = arr.length - 1;
        int ceil = 0; int floor = 0;
        int mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println();
                System.out.println("Found at index: " + mid);
                ceil = arr[mid]; floor = arr[mid];
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else {
                low = mid + 1;
                floor = arr[mid];
            }
        }

        System.out.println("Ceil Value = " + ceil);
        System.out.println("Floor Value = " + floor);

    }
}
