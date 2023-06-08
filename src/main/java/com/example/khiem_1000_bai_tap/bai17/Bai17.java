package com.example.khiem_1000_bai_tap.bai17;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai17(x, n);
        System.out.println(tong);
    }

    public static float tongBai17(int x, int n) {
        float tich1 = 1;
        float tich2 = 1;
        float tong = 0;
        for (float i = 1; i <= n; i++) {
            tich1 = tich1 * x;
            tich2 = tich2 * i;
            tong = tong + (tich1 / tich2);

        }
        return tong;
    }
}
