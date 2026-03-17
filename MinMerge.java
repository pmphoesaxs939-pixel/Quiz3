package Recursion;

import java.util.Scanner;

public class MinMerge {

    String merge(String str1, String str2) {

        if(str1.length()<=str2.length()){
            if(str1.length()==0){
                return str2;
            }
 
            if(str1.charAt(0)<=str2.charAt(0)){
                char w1 = str1.charAt(0);
                String text = String.valueOf(w1);
                str1 = str1.substring(1);
                str2 = str2.substring(1);
                return text + merge(str1, str2);
            }else{
                char w2 = str2.charAt(0);
                String text = String.valueOf(w2);
                str1 = str1.substring(1);
                str2 = str2.substring(1);
                return text + merge(str1, str2);
            }



        }else{
            if(str2.length()==0){
                return str1;
            }
 
            if(str2.charAt(0)<=str1.charAt(0)){
                char w2 = str2.charAt(0);
                String text = String.valueOf(w2);
                str1 = str1.substring(1);
                str2 = str2.substring(1);
                return text + merge(str1, str2);
            }else{
                char w1 = str1.charAt(0);
                String text = String.valueOf(w1);
                str1 = str1.substring(1);
                str2 = str2.substring(1);
                return text + merge(str1, str2);
            }



        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        MinMerge merger = new MinMerge();
        System.out.println(merger.merge(str1, str2));

        scan.close();
    }
}
