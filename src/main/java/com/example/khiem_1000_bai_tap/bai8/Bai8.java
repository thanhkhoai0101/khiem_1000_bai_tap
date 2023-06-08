package com.example.khiem_1000_bai_tap.bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float tong = tongBai8(n);
        System.out.println(tong);
    }

    public static float tongBai8(int n) {
        float tong = 0;
        for (float i = 1; i <= 2 * n + 1; i += 2) {
            tong += i / (i + 1);
        }
        return tong;
    }
}
