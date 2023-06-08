package com.example.khiem_1000_bai_tap.bai16;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai16(x, n);
        System.out.println(tong);
    }

    public static float tongBai16(int x, int n) {
        float tong = 0;
        float tong2 = 0;
        float tich = 1;

        for (float i = 1; i <= n; i++) {
            tong2 = tong2 + i;
            tich = tich * x;
            tong = tong + (tich / tong2);

        }
        return tong;
    }
}
