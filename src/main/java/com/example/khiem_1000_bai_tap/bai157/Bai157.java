package com.example.khiem_1000_bai_tap.bai157;

import java.util.Scanner;

public class Bai157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        int a = min(mang, n);
        int b = max(mang, n);
        System.out.println("Doan [a,b]Chua tat ca gia tri la " + a + " va " + b);
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int max(int[] mang, int n) {
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    public static int min(int[] mang, int n) {
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }
}
