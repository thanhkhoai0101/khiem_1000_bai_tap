package com.example.khiem_1000_bai_tap.bai300;

import java.util.Scanner;

public class Bai300 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        demGiam(arr, n);


    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static void xuatMang(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkGiam(float[] arr, int a, int b) {
        for (int i = a; i < b; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void demGiam(float[] arr, int n) {
        int dem = 0;
        System.out.println("Cac mang con giam dan la ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checkGiam(arr, i, j)) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    dem++;
                }
            }
        }
        System.out.println("SL mang con giam dan la " + dem);
    }
}
