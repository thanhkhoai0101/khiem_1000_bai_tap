package com.example.khiem_1000_bai_tap.bai15;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float tong = tongBai15(n);
        System.out.println(tong);
    }

    public static float tongBai15(int n) {
        float tong = 0;
        float tong2 = 0;
        for (float i = 1; i <= n; i++) {
            tong2 += i;
            tong = tong + (1 / tong2);

        }
        return tong;
    }
}
