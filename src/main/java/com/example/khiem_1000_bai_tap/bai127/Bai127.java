package com.example.khiem_1000_bai_tap.bai127;

import java.util.Scanner;

public class Bai127 {
    public static void main(String[] args) {
        int[] mang = new int[6];
        nhapMang(mang, 6);
        xuatMang(mang, 6);
        tangDan(mang, 6);
        xuatMang(mang, 6);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static void tangDan(int[] mang, int n) {
        int tam;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] > mang[j]) {
                    tam = mang[i];
                    mang[i] = mang[j];
                    mang[j] = tam;

                }
            }
        }
    }
}
