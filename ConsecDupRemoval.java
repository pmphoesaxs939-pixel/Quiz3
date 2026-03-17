package Recursion;

import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        if(str.length()==0){
            return "";
        }else if(str.length()==1){
            return str;
        }

        if(str.charAt(0)!=str.charAt(1)){
            char w1 = str.charAt(0);
            String text = String.valueOf(w1);
            str = str.substring(1);
            return text + dupRemove(str);
        }else{
            str = str.substring(1);
            return dupRemove(str);
        }
        

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);

        scan.close();
    }
}
