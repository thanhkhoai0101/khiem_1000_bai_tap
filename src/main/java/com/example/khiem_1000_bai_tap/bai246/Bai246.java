package com.example.khiem_1000_bai_tap.bai246;

import java.util.Scanner;

public class Bai246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (kTDoiXunG(arr, n) == 0) {
            System.out.println("Mang Khong Doi xung ");
        } else {
            System.out.println("mang doi xung ");
        }


    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static void xuatMang(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int kTDoiXunG(float[] arr, int n) {
        for (int i = 0; i <= n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return 0;
            }
        }
        return 1;
    }
}
