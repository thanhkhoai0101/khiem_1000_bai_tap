package com.example.khiem_1000_bai_tap.bai155;

import java.util.Scanner;

public class Bai155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong mang N ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        System.out.println("Nhap x ");
        int x = scanner.nextInt();
        System.out.println("Gia tri xa X nhat la " + xaNhat(mang, n, x));
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan Tu");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int xaNhat(int[] mang, int n, int x) {
        int a = 0;
        int max = Math.abs(mang[0] - x);
        for (int i = 1; i < n; i++) {
            if (Math.abs(mang[i] - x) > max) {
                a = i;
                max = Math.abs(mang[i] - x);
            }
        }
        return mang[a];
    }


}
