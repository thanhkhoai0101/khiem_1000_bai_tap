package com.example.khiem_1000_bai_tap.bai247;

import java.util.Scanner;

public class Bai247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (kTcHanLe(arr, n) == 0) {
            System.out.println("Mang Khong co tinh chat Chan Le ");
        } else {
            System.out.println("Mang co tinh Chat Chan Le");
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

    public static int kTcHanLe(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] + arr[i + 1]) % 2 == 0) {
                return 0;
            }
        }
        return 1;
    }
}
