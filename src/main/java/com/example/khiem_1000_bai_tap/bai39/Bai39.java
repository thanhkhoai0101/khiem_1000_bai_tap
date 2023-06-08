package com.example.khiem_1000_bai_tap.bai39;

import java.util.Scanner;

public class Bai39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = tongBai39(n);
        System.out.println(tong);
    }

    public static double tongBai39(int n) {
        double tong = 0;
        long tich = 1;
        for (double i = 1; i <= n + 1; i++) {
            tich *= i;
            tong = Math.pow(tong + tich, 1 / (i + 1));
        }
        return tong;
    }

}
