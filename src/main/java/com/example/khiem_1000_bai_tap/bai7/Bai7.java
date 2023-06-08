package com.example.khiem_1000_bai_tap.bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float tong = tongBai7(n);
        System.out.println(tong);
    }

    public static float tongBai7(int n) {
        float tong = 0;
        for (float i = 1; i <= n; i++) {
            tong += i / (i + 1);
        }
        return tong;
    }
}
