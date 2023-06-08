package com.example.khiem_1000_bai_tap.bai19;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai19(x, n);
        System.out.println(tong);
    }

    public static float tongBai19(int x, int n) {
        float tich1 = 1;
        float tich2 = 1;
        float tong = 1;
        for (float i = 1; i <= 2 * (n + 1); i++) {
            tich1 = tich1 * x;
            tich2 = tich2 * i;
            if (i % 2 != 0) {
                tong = tong + (tich1 / tich2);
            }

        }
        return tong;

    }
    // todo 4 bài
}
