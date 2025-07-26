package JAVA_DSA.STRING;

import java.util.Scanner;

public class toggle_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder strB = new StringBuilder(str);

        String str2 = str.toLowerCase();
        StringBuilder strB2 = new StringBuilder(str2);

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            char chr2 = str2.charAt(i);

//            if(chr != chr2)                       INCOMPLETE
        }
    }
}
