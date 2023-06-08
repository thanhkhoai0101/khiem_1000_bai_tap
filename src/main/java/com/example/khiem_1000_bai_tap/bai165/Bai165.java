package com.example.khiem_1000_bai_tap.bai165;

import java.util.Scanner;

public class Bai165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (soLedau(mang, n) == 0) {
            System.out.println("Khong co gia tri nao thoa man " + 0);
        } else {
            System.out.println("Gia tri co so le dau dau tien la " + soLedau(mang, n));
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soLedau(int[] mang, int n) {
        int timso = 0;
        for (int i = 0; i < n; i++) {
            for (int j = mang[i]; j >= 1; j /= 10) {
                timso = j % 10;
            }
            if (timso % 2 != 0) {
                return mang[i];
            }
        }
        return 0;
    }
}
