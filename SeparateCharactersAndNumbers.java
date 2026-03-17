package Recursion;

import java.util.Scanner;

public class SeparateCharactersAndNumbers {

    static String split(String msg){

    if(msg.length() == 0){
        return "";
    }

    char c = msg.charAt(0);

    String rest = split(msg.substring(1));

    if(Character.isDigit(c)){
        return rest + c;
    }else{
        return c + rest;
    }

}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String msg = sc.next();

        String res = split(msg);

        System.out.println(res);

        sc.close();
    }
}