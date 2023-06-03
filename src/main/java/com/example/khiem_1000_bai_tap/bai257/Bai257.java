package com.example.khiem_1000_bai_tap.bai257;

import java.util.Scanner;

public class Bai257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        viTriTangDan(arr, n);

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

    public static void viTriTangDan(int[] arr, int n) {
        int b;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = i + 2; j < n; j += 2) {
                    if (arr[i] > arr[j]) {
                        b = arr[i];
                        arr[i] = arr[j];
                        arr[j] = b;
                    }
                }
            }
        }
        System.out.println("Mang sau Khi sap xep cac vi tri le tang dan ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
