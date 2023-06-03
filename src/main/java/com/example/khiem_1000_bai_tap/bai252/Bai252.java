package com.example.khiem_1000_bai_tap.bai252;

import java.util.Scanner;

public class Bai252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (kTraDangSong(arr, n) != n - 2) {
            System.out.println("Khong Phai Mang Dang song ");
        } else {
            System.out.println("La Mang dang Song ");
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

    public static int kTraDangSong(int[] arr, int n) {
        int a = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] || arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                a++;
            }
        }
        return a;
    }
}
