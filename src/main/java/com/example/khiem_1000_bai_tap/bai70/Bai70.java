package com.example.khiem_1000_bai_tap.bai70;

import java.util.Scanner;

public class Bai70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai70(x, n);
        System.out.println(tong);

    }

    public static float tongBai70(int x, int n) {
        float tong = 0;
        float S = 0;
        for (float i = 1; i <= n; i++) {
            S += i;
            tong += Math.pow(-1, i + 1) * (1 / S);
        }
        return tong;
    }
}
