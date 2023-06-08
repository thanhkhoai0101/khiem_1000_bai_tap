package com.example.khiem_1000_bai_tap.bai40;

import java.util.Scanner;

public class Bai40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        double tong = tongBai40(n, x);
        System.out.println(tong);
    }

    public static double tongBai40(int n, int x) {
        double tong = 0;
        long tich = 1;
        for (double i = 1; i <= n; i++) {
            tich *= x;
            tong = Math.sqrt(tong + tich);
        }
        return tong;
    }
}
