package com.example.khiem_1000_bai_tap.bai207;

import java.util.Scanner;

public class Bai207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        System.out.println("Tong cac GT cuc tri trong mang la " + tOngCucTri(arr, n));

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int tOngCucTri(int[] arr, int n) {
        int tong = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] || arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
