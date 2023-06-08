package com.example.khiem_1000_bai_tap.bai166;

import java.util.Scanner;

public class Bai166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (timSo(mang, n) == 0) {
            System.out.println("Khong co gia tri nao co dang  2^k " + 0);
        } else {
            System.out.println("So co dang 2^k dau tien la " + timSo(mang, n));
        }
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int timSo(int[] mang, int n) {
        int tich;
        for (int i = 0; i < n; i++) {
            tich = 1;
            for (int j = 1; j < mang[i]; j++) {
                tich = tich * 2;
                if (tich == mang[i]) {
                    return mang[i];
                }
            }
        }
        return 0;
    }
}
