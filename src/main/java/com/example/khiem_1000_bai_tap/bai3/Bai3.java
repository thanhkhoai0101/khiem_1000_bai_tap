package com.example.khiem_1000_bai_tap.bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float tong = tongBai3(n);
        System.out.println(tong);

    }

    public static float tongBai3(int n) {

        float tong = 0;
        for (float i = 1; i <= n; i++) {
            tong += (1 / i);
        }
        return tong;
    }


}
