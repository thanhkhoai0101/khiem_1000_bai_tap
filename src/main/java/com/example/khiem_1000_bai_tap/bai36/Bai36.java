package com.example.khiem_1000_bai_tap.bai36;

import java.util.Scanner;

public class Bai36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = tongBai36(n);
        System.out.println(tong);
    }

    public static double tongBai36(int n) {
        double tong = 0;
        double tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
            tong = Math.sqrt(tong + tich);
        }
        return tong;
    }
}
