package com.example.khiem_1000_bai_tap.bai309;

import java.util.Scanner;

public class Bai309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NhapSl Mang A ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        mangB(arr, arr2, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        System.out.print("Mang A = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mangB(int[] arr, int[] arr1, int n) {
        int tong;
        arr1[0] = Math.abs(arr[1]);
        arr1[n - 1] = Math.abs(arr[n - 2]);
        for (int i = 1; i < n - 1; i++) {
            tong = (arr[i - 1] + arr[i + 1]);
            arr1[i] = tong;
        }
        System.out.print("Mang B = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
