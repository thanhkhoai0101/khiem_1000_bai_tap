package com.example.khiem_1000_bai_tap.bai42;

import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = tongBai42(n);
        System.out.println(k);
    }

    public static int tongBai42(int n) {
        int k = 0;
        int tong = 0;
        for (int i = 1; i < n; i++) {
            tong = tong + i;
            k = i;
            if (tong + i >= n) {
                break;
            }
        }
        return k;
    }
}
