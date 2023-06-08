package com.example.khiem_1000_bai_tap.bai74;

import java.util.Scanner;

public class Bai74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai74(x, n);
        System.out.println(tong);
    }

    public static float tongBai74(int x, int n) {
        float tong = 0;
        double tich = 1;
        for (float i = 1; i <= n; i++) {
            tich = tich * (i * 2) * (i * 2 + 1);
            tong += Math.pow(-1, i + 1) * (Math.pow(x, i * 2+1) / tich);
        }
        return tong;
    }
}
