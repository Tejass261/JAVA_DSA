package JAVA_DSA.STRING;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class str_cmp_advance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.next();
        String str2 = "";
        str2 += str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) != str.charAt(i)) {
                if(count > 1){
                    str2 += count;
                }
                str2 += str.charAt(i);
            }
            if(str.charAt(i-1) == str.charAt(i)) {
                count++;
            }else {
                count = 1;
            }
        }
        System.out.println(str2);
    }
}
