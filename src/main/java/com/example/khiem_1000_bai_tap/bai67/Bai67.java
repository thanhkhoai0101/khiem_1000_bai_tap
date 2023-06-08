package com.example.khiem_1000_bai_tap.bai67;

import java.util.Scanner;

public class Bai67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double n = scanner.nextInt();
        double tong = tongBai67(x, n);
        System.out.println(tong);
    }

    public static double tongBai67(double x, double n) {
        double tong = 0;
        for (double i = 1; i <= n; i++) {
            tong += Math.pow(-1, 1 + i) * Math.pow(x, i);
        }
        return tong;
    }


}
