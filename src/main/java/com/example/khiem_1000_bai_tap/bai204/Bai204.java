package com.example.khiem_1000_bai_tap.bai204;

import java.util.Scanner;

public class Bai204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu N ");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        System.out.println("Tong gt lonHon gt truoc no la " + tongGt(arr, n));

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
    }

    public static float tongGt(float[] arr, int n) {
        float tong = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
