package Recursion;

import java.util.Scanner;

public class GoInside {
    String goInside(String str, boolean front) {
        if(str.length()==0){
            return "";
        }else if(str.length()==1){
            return str;
        }

        String w1 = str.substring(0,1);
        String w2 = str.substring(str.length()-1);

        str = str.substring(1, str.length()-1);
        
        if(front==true){
            String newW = w1+w2;
            front = false;
            return newW + (goInside(str, front));
        }else{
            String newW = w2+w1;
            front = true;
            return newW + (goInside(str, front));
        }
        


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);

        scan.close();
    }
}
