package com.example.khiem_1000_bai_tap.bai61;

import java.util.Scanner;

public class Bai61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean giamDan = soGiamDan(n);
        if (giamDan) {
            System.out.println(n + " la so giam dan");
        } else {
            System.out.println(n + " khong phai la so giam dan");
        }
    }

    public static boolean soGiamDan(int n) {
        boolean giamDan = true;
        int t = 0;
        int x = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t < x) {
                return false;
            }
            x = t;
        }
        return giamDan;
    }
}

