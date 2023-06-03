package com.example.khiem_1000_bai_tap.bai240;

import java.util.Scanner;

public class Bai240 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (tonTaiKo(arr, n) == 1) {
            System.out.println("Trong mang ton tai 0 " + 1);
        } else {
            System.out.println("trong mang Khong ton tai so 0 ");
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

    public static int tonTaiKo(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                return 1;
            }
        }
        return 0;
    }
}
