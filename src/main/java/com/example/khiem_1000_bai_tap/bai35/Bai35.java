package com.example.khiem_1000_bai_tap.bai35;

import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = tongBai35(n);
        System.out.println(tong);

    }

    public static double tongBai35(int n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong = Math.sqrt(tong + i);
        }
        return tong;
    }
}
