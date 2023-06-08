package com.example.khiem_1000_bai_tap.bai21;

import java.util.Scanner;

public class BAi21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = tongBai21(n);
        System.out.println("tong uoc cua n = " + tong);
    }

    public static int tongBai21(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tong = tong + i;
            }

        }
        return tong;
    }
}
