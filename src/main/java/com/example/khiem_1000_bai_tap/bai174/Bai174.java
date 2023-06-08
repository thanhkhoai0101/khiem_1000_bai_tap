package com.example.khiem_1000_bai_tap.bai174;

import java.util.Scanner;

public class Bai174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Luong Phan Tu ");
        int n = scanner.nextInt();

        int[] mang = new int[n];
        nhapMang(mang, n);
        lietKeAB(mang, n);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < n) {
            System.out.println("Nhap phan tu " + i);
            int x = scanner.nextInt();
            if (check(mang, i + 1, x)) {
                System.out.println("Nhap Lai ");
            } else {
                mang[i] = x;
                i++;
            }
        }
    }

    public static boolean check(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void lietKeAB(int[] mang, int n) {
        System.out.println("Cac Cap so thoa man DK la ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mang[i] < mang[j]) {
                    System.out.println(mang[i] + " " + mang[j]);
                }
            }
        }
    }
}
