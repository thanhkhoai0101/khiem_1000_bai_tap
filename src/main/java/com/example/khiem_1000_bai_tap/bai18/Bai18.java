package com.example.khiem_1000_bai_tap.bai18;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai18(x, n);
        System.out.println(tong);
    }

    public static float tongBai18(int x, int n) {
        float tich1 = 1;
        float tich2 = 1;
        float tong = 1;
        for (float i = 1; i <= 2 * n; i++) {
            tich1 = tich1 * x;
            tich2 = tich2 * i;
            if (i % 2 == 0) {
                tong = tong + (tich1 / tich2);
            }

        }
        return tong;

    }

    // Todo mần lại
}
