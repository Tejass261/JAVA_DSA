package JAVA_DSA.STRING;

import java.util.Scanner;

public class array_prime_remove {

    public static boolean is_prime(int x){
        for (int i = 2; i*i <= x; i++) {
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
//        logic for checking
        int i = 0;
        while(i < n){
            boolean prime = is_prime(arr[i]);
            if(prime){
                for (int j = i + 1; j < n; j++) {
                    arr[j-1] = arr[j];
                }
                n--;
            } else {
                i++;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("Length of array:" + n);
    }
}
