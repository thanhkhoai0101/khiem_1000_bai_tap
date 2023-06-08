package com.example.khiem_1000_bai_tap.bai295;

import java.util.Scanner;

public class Bai295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        mangConTang(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap PT thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean kTTAng(int[] arr, int a, int b) {
        for (int i = a; i < b; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void mangConTang(int[] arr, int n) {
        System.out.println("Cac mang con tang dan ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (kTTAng(arr, i, j)) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
