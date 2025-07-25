package JAVA_DSA.STRING;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class String_compress_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.next();
        String str2 = "";
        str2 += str.charAt(0);

//        int count = 0;
        for (int i = 1; i < str.length(); i++) {
//            count++;
            if(str.charAt(i-1) != str.charAt(i)) {
//                str2 += count;
                str2 += str.charAt(i);
//                count = 0;
            }
        }
        System.out.println(str2);
    }
}
