package com.example.khiem_1000_bai_tap.bai150;

import java.util.Scanner;

public class Bai150 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nhapMang(mang, n);
        int sOAm = maxSoAm(mang, n);
        if (sOAm == 0) {
            System.out.println("Khong co so am nao " + sOAm);
        } else {
            System.out.println("So am LN la " + sOAm);
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int maxSoAm(int[] mang, int n) {
        int max = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] > max && mang[i] < 0 || max >= 0) {
                max = mang[i];
            }
        }
        if (max < 0) {
            return max;
        } else {
            return 0;
        }
    }
}
