package Recursion;

import java.util.Scanner;

public class CountPrefix {

    static int countPrefix(String str, char c) {
        if(str.charAt(0)!=c){
            return 0;
        }


        str=str.substring(1);
        return 1 + countPrefix(str,c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        int ans = countPrefix(str, c);
        System.out.println(ans);

        sc.close();
    }
}
