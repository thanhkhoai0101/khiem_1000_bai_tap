package com.example.khiem_1000_bai_tap.bai34;

import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double tong = tongBai34(n);
        System.out.println(tong);

    }

    public static double tongBai34(int n) {
        double tong = 0;
        for (double i = n; i > 0; i--) {
            tong = Math.sqrt(tong + i);
        }
        return tong;
    }
}
