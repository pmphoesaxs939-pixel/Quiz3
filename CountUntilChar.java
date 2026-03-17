package Recursion;

import java.util.Scanner;

public class CountUntilChar {

    static int countUntilChar(String str, char c) {

        if (str.length() == 0) { // ไม่เจอ c
            return 0;
        }

        if (str.charAt(0) == c) { // เจอ c
            return 0;
        }

        return 1 + countUntilChar(str.substring(1), c);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char w = sc.next().charAt(0);

        int result = countUntilChar(str, w);
        System.out.println(result);

        sc.close();
    }

}
