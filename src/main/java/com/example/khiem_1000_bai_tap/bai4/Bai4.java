package com.example.khiem_1000_bai_tap.bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float tong = tongBai4(n);
        System.out.println(tong);

    }

    public static float tongBai4(int n) {
        float tong = 1;
        for (float i = 2; i <= 2 * n; i += 2) {
            tong += (1 / i);

        }
        return tong;
    }
}
