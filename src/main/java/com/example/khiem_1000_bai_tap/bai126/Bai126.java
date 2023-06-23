package com.example.khiem_1000_bai_tap.bai126;


import java.util.Scanner;

public class Bai126 {
    public static void main(String[] args) {
        int[] mang = new int[8];
        nhapMang(mang, 8);
        int tong = tongSoam(mang, 8);
        System.out.println("tong so am la " + tong);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int tongSoam(int[] mang, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] < 0) {
                tong += mang[i];
            }
        }
        return tong;
    }
}
