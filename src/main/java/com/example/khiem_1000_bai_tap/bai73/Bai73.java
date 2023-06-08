package com.example.khiem_1000_bai_tap.bai73;

import java.util.Scanner;

public class Bai73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai73(x, n);
        System.out.println(tong);
    }

    public static float tongBai73(int x, int n) {
        float tong = -1;
        double tich = 1;
        for (float i = 1; i <= n; i++) {
            tich = tich * (i * 2) * (i * 2 - 1);
            tong += Math.pow(-1, i + 1) * (Math.pow(x, i * 2) / tich);
        }
        return tong;
    }
}
