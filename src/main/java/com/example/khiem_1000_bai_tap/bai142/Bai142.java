package com.example.khiem_1000_bai_tap.bai142;

import java.util.Scanner;

public class Bai142 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 10);
        xuatMang(mang, 10);
        int min = giaTrinNN(mang, 10);
        System.out.println("Gia tri nho nhat trong mang la " + min);

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
    }

    public static int giaTrinNN(int[] mang, int n) {
        int min = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }
}
