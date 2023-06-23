package com.example.khiem_1000_bai_tap.bai304;

import java.util.Scanner;

public class Bai304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        System.out.println("Nhap M ");
        int m = scanner.nextInt();
        mangConCoTongBangM(arr, n, m);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkTong(int[] arr, int a, int b, int m) {
        int tong = 0;
        for (int i = a; i <= b; i++) {
            tong += arr[i];
        }
        return tong == m;
    }

    public static void mangConCoTongBangM(int[] arr, int n, int m) {
        int dem = 0;
        System.out.println("Mang con co tong bang "+m+" la ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkTong(arr, i, j, m)) {
                    dem++;
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if (dem == 0) {
            System.out.println("Khong Co ");
        }
    }
}
