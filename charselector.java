package Recursion;

import java.util.Scanner;
/*ทำไม่ได้โจทย์กำกวม ไม่ชัดเจน */
public class charselector {

    String selectChar(String s, int[] k){
        if(k.length==0){
            return "";
        }

        int N = k.length;
        int move = k[0] % N;
        char newchar = s.charAt(move);

        int[] newk = new int[k.length - 1];
        for (int i = 1; i < newk.length; i++) {
            newk[i - 1] = k[i];
        }

        return newchar + selectChar(s, newk);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        final int N = s.length();

        int[] k = new int[N];

        for (int i = 0; i < k.length; i++) {
            k[i] = sc.nextInt();
        }

        charselector selector = new charselector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);

        sc.close();
    }
}
