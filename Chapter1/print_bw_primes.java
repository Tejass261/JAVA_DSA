package JAVA_DSA.Chapter1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class print_bw_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low;i<=high;i++){
            int count = 0;
            for(int j = 2;j*j<=i;j++){
                if(i%j ==0){
                    count++;
                    break;
                }

            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}