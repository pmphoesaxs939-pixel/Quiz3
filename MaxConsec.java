package Recursion;

import java.util.Scanner;

public class MaxConsec {

    static int countFirstConsec(String str) {
        // 1. Base Case: ถ้า String ยาวแค่ 0 หรือ 1 ตัว ให้หยุดนับ (คืนค่า 1 เพราะนับตัวมันเอง)
        if (str.length() <= 1) {
            return str.length();
        }

        // 2. เช็คว่าตัวแรก เหมือนกับตัวที่สองไหม
        if (str.charAt(0) == str.charAt(1)) {
            // ถ้าเหมือนกัน ให้นับ 1 แล้วเรียกตัวเองเพื่อไปเช็คตัวถัดไป
            return 1 + countFirstConsec(str.substring(1));
        } else {
            // ถ้าไม่เหมือนกันแล้ว (เจอตัวอื่นคั่น) ให้หยุดนับแค่ตรงนี้ (คืนค่า 1
            // ของตัวมันเอง)
            return 1;
        }

    }

    static int maxConsec(String str) {

        // เขียน recursion เพื่อหาจำนวนตัวอักษรที่ซ้ำติดกันมากที่สุด
        if (str.isEmpty()) {
            return 0;
        }
        int firstRe = countFirstConsec(str);

        int MaxRe = maxConsec(str.substring(firstRe));

        return Math.max(firstRe, MaxRe);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = maxConsec(str);
        System.out.println(ans);

        sc.close();
    }
}