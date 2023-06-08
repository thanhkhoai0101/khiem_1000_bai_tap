package com.example.khiem_1000_bai_tap.bai161;

import java.util.Scanner;

public class Bai161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        System.out.println("Nhap X, Y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (timXY(mang, n, x, y) == x) {
            System.out.println("Khong co gt thoa man " + x);
        } else {
            System.out.println(" GT dau tien nam trong doan x,y la " + timXY(mang, n, x, y));
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int timXY(int[] mang, int n, int x, int y) {
        for (int i = 0; i < n; i++) {
            if (mang[i] > x && mang[i] < y) {
                return mang[i];
            }
        }
        return x;
    }

}
