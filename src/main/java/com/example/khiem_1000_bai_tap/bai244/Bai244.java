package com.example.khiem_1000_bai_tap.bai244;

import java.util.Scanner;

public class Bai244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (tonTaiSHT(arr, n) == 0) {
            System.out.println("Ton tai SHT >256 =>> Khong thoa man " + 0);
        } else {
            System.out.println("Khong ton tai So Hoan Thien > 256 =>> thoa man " + 1);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static boolean checkHoanThien(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static int tonTaiSHT(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (checkHoanThien(arr[i]) && arr[i] > 256) {
                return 0;
            }
        }
        return 1;
    }
}
