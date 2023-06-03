package com.example.khiem_1000_bai_tap.bai266;

import java.util.Scanner;

public class Bai266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        System.out.println("Nhap Vi tri K va gia tri X ");
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        chenMang(arr, n, x, k);

    }

    public static void nhaPManG(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTManG(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void chenMang(int[] arr, int n, int x, int k) {
        for (int i = n; i > k; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = x;
        System.out.println("Mang N sau Khi chen X vao vi tri K ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
