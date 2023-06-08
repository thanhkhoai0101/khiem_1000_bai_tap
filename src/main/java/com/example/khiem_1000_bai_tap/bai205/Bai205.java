package com.example.khiem_1000_bai_tap.bai205;

import java.util.Scanner;

public class Bai205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        System.out.println("Tong Gt la " + tongGT(arr, n));

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap GT ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
    }

    public static float tongGT(float[] arr, int n) {
        float tong = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > Math.abs(arr[i + 1])) {
                tong += arr[i];
            }
        }
        return tong;
    }

}
