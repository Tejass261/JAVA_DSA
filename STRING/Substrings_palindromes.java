package JAVA_DSA.STRING;

import java.util.Scanner;

public class Substrings_palindromes {

    public static boolean is_Palindrome(String ss){
        int i = 0;
        int j = ss.length() - 1;

        while(i <= j){
            char c1 = ss.charAt(i);
            char c2 = ss.charAt(j);
            if(c1 != c2) return false;
            else i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = sc.next();

        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
//                System.out.println(ss);
                if(is_Palindrome(ss)){
                    System.out.println(ss);
                }
            }
        }
    }
}
