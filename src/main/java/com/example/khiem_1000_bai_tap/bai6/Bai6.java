package com.example.khiem_1000_bai_tap.bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float tong = tongBai6(n);
        System.out.println(tong);

    }

    public static float tongBai6(int n) {
        float tong = 0;
        for (float i = 1; i <= n; i++) {
            tong += 1 / (i * (i + 1));
        }
        return tong;
    }

}
