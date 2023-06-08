package com.example.khiem_1000_bai_tap.bai60;

import java.util.Scanner;

public class Bai60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean tangDan = soTangdan(n);
        if (tangDan == true) {
            System.out.println(n + " la so tang dan");
        } else {
            System.out.println(n + " khong phai la so tang dan");
        }
    }

    public static boolean soTangdan(int n) {
        boolean tangDan = true;
        int t = 0;
        int x = 9;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t > x) {
                return false;
            }
            x = t;
        }
        return tangDan;
    }

}
