package com.example.khiem_1000_bai_tap.bai215;

import java.util.Scanner;

public class Bai215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sl mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        System.out.println("TBC khoang cach cac gia tri trong mang la " + kHoangCachTB(arr, n));

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("nhap GT PHan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static float kHoangCachTB(int[] arr, int n) {
        float tong = 0;
        float tbc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                tong += Math.abs(arr[i] - arr[j]);
                tbc++;
            }
        }
        return tong / tbc;
    }
}
