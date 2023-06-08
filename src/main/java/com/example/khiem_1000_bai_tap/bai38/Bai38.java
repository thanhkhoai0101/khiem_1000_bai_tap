package com.example.khiem_1000_bai_tap.bai38;

import java.util.Scanner;

public class Bai38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = tongBai38(n);
        System.out.println(tong);
    }

    public static double tongBai38(int n) {
        double tong = 0;
        for (double i = 1; i <= n; i++) {

            tong = Math.pow(tong + i, 1 / (i + 1));
        }
        return tong;
    }
}
