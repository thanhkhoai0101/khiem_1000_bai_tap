package com.example.khiem_1000_bai_tap.bai151;

import java.util.Scanner;

public class Bai151 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nhapMang(mang, n);
        int max = maxSNT(mang, n);
        if (max == 0) {
            System.out.println("Khong co so nguyen to nao " + max);
        } else {
            System.out.println("So NT LN la " + max);
        }
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int maxSNT(int[] mang, int n) {
        int dem = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < mang[i]; j++) {
                if (mang[i] > 1 && mang[i] % j == 0) {
                    dem++;
                }
            }
            if (dem == 1 && mang[i] > max) {
                max = mang[i];
            }
            dem=0;
        }
        return max;
    }
}
