package Recursion;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int base = sc.nextInt();

        if(decimal==0){
            System.out.println(0);
        }else{
            String ans = "";
            while(decimal>0){
                int r = decimal%base;
                ans = r + ans;
                decimal = decimal/base;
            }
        System.out.println(ans);
        }
        sc.close();

    }
}
