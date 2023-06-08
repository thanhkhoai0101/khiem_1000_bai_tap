package com.example.khiem_1000_bai_tap.bai175;

import java.util.Scanner;

public class Bai175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        lietKe(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < n) {
            System.out.println("Nhap phan tu thu " + i);
            int x = scanner.nextInt();
            if (tonTai(arr, i, x)) {
                System.out.println("Nhap lai phan tu " + i);
            } else {
                arr[i] = x;
                i++;
            }
        }
    }

    public static boolean tonTai(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static int Min(int[] arr, int n) {
        int min = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (Math.abs(arr[i] - arr[j]) < min) {
                        min = Math.abs(arr[i] - arr[j]);
                    }
                }
            }
        }
        return min;
    }

    public static void lietKe(int[] arr, int n) {
        System.out.println("Cac gia tri Gan nhau nhat la");
        int min = Min(arr, n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == min) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
