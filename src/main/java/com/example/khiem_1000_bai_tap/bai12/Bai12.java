package com.example.khiem_1000_bai_tap.bai12;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        long tong = tongBAi12(n, x);
        System.out.println(tong);
    }

    public static long tongBAi12(int n, int x) {
        long tich = 1;
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tich = tich * x;
            tong = tong + tich;
        }
        return tong;
    }
}
