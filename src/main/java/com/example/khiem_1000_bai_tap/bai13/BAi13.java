package com.example.khiem_1000_bai_tap.bai13;

import java.util.Scanner;

public class BAi13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        long tong = tongBai13(n, x);
        System.out.println(tong);
    }

    public static long tongBai13(int n, int x) {
        long tong = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            tong += Math.pow(x, i);
        }
        return tong;
    }
    // TODO mần lại
}
