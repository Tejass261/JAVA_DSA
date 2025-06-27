package JAVA_DSA.Chapter1;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int i = 2;
        int flag = 0;
        while(i*i<=x){
            if(x%i == 0){
                flag = -1;
                break;
            }else{
                i++;
            }
        }
        if(flag == -1) System.out.println("Not Prime");
        else System.out.println("Prime");
    }
}
