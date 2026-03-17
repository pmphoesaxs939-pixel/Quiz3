package Recursion;

import java.util.Scanner;

public class CountFirstDigit {

    static int countFirstDigit(String str) {
        if(!Character.isDigit(str.charAt(0))){
            return 0;
        }

        str=str.substring(1);
        return 1+countFirstDigit(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = countFirstDigit(str);
        System.out.println(ans);

        sc.close();
    }
}