package com.example.khiem_1000_bai_tap.bai14;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        long tong = tongBai14(x, n);
        System.out.println(tong);
    }

    public static long tongBai14(int x, int n) {
        long tong = 0;
        for (int i = 1; i <= 2 * n + 1; i += 2) {
            tong += Math.pow(x, i);

        }
        return tong;
    }

    // todo mần lại
}
