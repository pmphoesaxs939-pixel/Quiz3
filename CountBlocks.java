package Recursion;

import java.util.Scanner;

public class CountBlocks {

    static int countFirstConsec(String str) {
        if(str.length()<=1||str.charAt(0)!=str.charAt(1)){
            return 1;
        }

        return 1 + countFirstConsec(str.substring(1));
    }

    static int countBlocks(String str) {
        if(str.isEmpty()){
            return 0;
        }

        int first = countFirstConsec(str);

        return 1 + countBlocks(str.substring(first));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = countBlocks(str);
        System.out.println(ans);

        sc.close();
    }
}