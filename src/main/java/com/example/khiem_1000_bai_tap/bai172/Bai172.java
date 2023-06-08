package com.example.khiem_1000_bai_tap.bai172;

import java.util.Scanner;

public class Bai172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        System.out.println("BCNN la " + boiChungNN(mang, n));

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static long tich(int[] mang, int n) {
        long tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= mang[i];
        }
        return tich;
    }

    public static int max(int mang[], int n) {
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    public static long boiChungNN(int[] mang, int n) {
        long boiChung = tich(mang, n);
        int min = max(mang, n);
        int dem;

        for (int i = min; i < boiChung; i++) {
            dem = 0;
            for (int j = 0; j < n; j++) {
                if (i % mang[j] == 0) {
                    dem++;
                }
            }
            if (dem == n) {
                boiChung = i;
                break;
            }
        }
        return boiChung;

    }
}
