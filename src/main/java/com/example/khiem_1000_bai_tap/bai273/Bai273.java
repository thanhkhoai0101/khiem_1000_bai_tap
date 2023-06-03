package com.example.khiem_1000_bai_tap.bai273;

import java.util.Scanner;

public class Bai273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        xoaAm(arr, n);


    }

    public static void nhaPManG(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static void xuaTManG(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void xoaAm(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
            }
        }
        System.out.println("Mang Sau Khi xoa GT am ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
