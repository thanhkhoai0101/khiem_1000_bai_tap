package com.example.khiem_1000_bai_tap.bai69;

import java.util.Scanner;

public class Bai69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double n = scanner.nextInt();
        double tong = tongBai69(x, n);
        System.out.println(tong);
    }

    public static double tongBai69(double x, double n) {
        double tong = x;
        for (double i = 1; i <= n; i++) {
            tong += Math.pow(-1, i) * Math.pow(x, i * 2 + 1);
        }
        return tong;
    }

}
