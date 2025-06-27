package JAVA_DSA.Chapter_Patterns;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sp=x/2; int st=1;
        for(int i=1;i<=x;i++){

            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }

            if(i<=x/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
            System.out.println("");
        }
    }
}
