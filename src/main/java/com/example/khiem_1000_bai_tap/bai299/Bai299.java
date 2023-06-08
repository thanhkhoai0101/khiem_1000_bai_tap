package com.example.khiem_1000_bai_tap.bai299;

import java.util.Scanner;

public class Bai299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        conDuong(arr, n);


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

    public static boolean checkDuong(float[] arr, int a, int b) {
        for (int i = a; i <= b; i++) {
            if (arr[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void conDuong(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checkDuong(arr, i, j)) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
