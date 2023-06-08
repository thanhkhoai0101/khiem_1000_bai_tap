package com.example.khiem_1000_bai_tap.bai33;

import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = tongBai33(n);
        System.out.println(tong);
    }

    public static double tongBai33(int n) {
        double tong = 0;
        for (double i = 1; i <= n; i++) {
            tong = Math.sqrt(tong + 2);
        }
        return tong;
    }
}
