package Recursion;

import java.util.Scanner;

public class CountSuffix {

    static int countSuffix(String str, char c) {
        if (str.isEmpty()) {
            return 0;
        }

        char lastChar = str.charAt(str.length() - 1);

        if (lastChar == c) {
            
            return 1 + countSuffix(str.substring(0, str.length() - 1), c);
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        int ans = countSuffix(str, c);
        System.out.println(ans);

        sc.close();
    }
}
