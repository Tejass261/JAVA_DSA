package JAVA_DSA.Chapter1;/*
You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.

Take as input n and k.

Print the rotated number.

Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
n = 12340056
k = 3
r = 05612340
*/

import java.util.Scanner;

public class rotation_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = sc.nextInt();
        int count = count_num.countDigits(x);

        p = p % count;
        if(p<0){
            p = p+count;
        }

        int new_num = (x%(int)Math.pow(10,p))*((int)Math.pow(10,count-p))+(x/(int)Math.pow(10,p));
        System.out.println(new_num);
    }
}
