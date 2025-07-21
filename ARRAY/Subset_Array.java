package JAVA_DSA.ARRAY;

import java.util.Scanner;

public class Subset_Array {

    public static int dec_to_binary(int i){
        int binary = 0;int rem;int p = 0;
        while(i > 0){
            rem = i%2;
            i /= 2;
            binary += rem*(int)Math.pow(10,p);
            p++;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter The Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int limit = (int)Math.pow(2, n);
        for (int i = 0; i <= limit; i++) {
            int binary = dec_to_binary(i);
//            for (int j = 0; j < n; j++) {
//                if (arr[j] == 1) {                                        WAY TO COMPLEX, DIDN'T UNDERSTAND
//                    System.out.println(arr[j]);                                      TRY LATER
//                }
//            }
        }
    }
}