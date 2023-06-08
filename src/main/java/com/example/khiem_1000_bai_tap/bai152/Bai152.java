package com.example.khiem_1000_bai_tap.bai152;

import java.util.Scanner;

public class Bai152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (soHtNn(mang, n) == 0) {
            System.out.println("Khong co so HT nao " + soHtNn(mang, n));
        } else {
            System.out.println("So HT NN la " + soHtNn(mang, n));
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static boolean checkSHT(int n) {
        int tong = 0;
        if (n == 0) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;

    }

    public static int hoanThiendau(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            if (checkSHT(mang[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int soHtNn(int[] mang, int n) {
        int min = mang[hoanThiendau(mang,n)];
        if (min == -1) {
            return 0;
        }
        for (int i = hoanThiendau(mang,n)+1; i < n; i++) {
            if (checkSHT(mang[i]) && mang[i] < min) {
                min = mang[i];
            }
        }
        return min;

    }


}
