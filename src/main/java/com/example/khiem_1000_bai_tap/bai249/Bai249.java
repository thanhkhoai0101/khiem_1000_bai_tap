package com.example.khiem_1000_bai_tap.bai249;

import java.util.Scanner;

public class Bai249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (ktgIamDan(arr, n) == 0) {
            System.out.println("Mang khong giam dan ");
        } else {
            System.out.println("Mang giam dan ");
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

    public static int ktgIamDan(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
