package com.example.khiem_1000_bai_tap.bai72;

import java.util.Scanner;

public class Bai72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        float tong = tongBai72(x, n);
        System.out.println(tong);

    }

    public static float tongBai72(int x, int n) {
        float tong = 0;
        float tich=1;
        for (float i = 1; i <= n; i++) {
            tich*=i;
            tong += Math.pow(-1, i) * (Math.pow(x, i) / tich);
        }
        return tong;
    }
}
