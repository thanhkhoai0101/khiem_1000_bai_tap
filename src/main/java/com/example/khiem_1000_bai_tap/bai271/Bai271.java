package com.example.khiem_1000_bai_tap.bai271;

import java.util.Scanner;

public class Bai271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL phan tu  Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        System.out.println("Nhap Vi Tri Muon Xoa ");
        int k = scanner.nextInt();
        while (k < 0 || k >= n) {
            System.out.println("Nhap lai vi tri muon xoa ( #0 va K<N)");
            k = scanner.nextInt();
        }
        xoaViTri(arr, n, k);


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

    public static void xoaViTri(int[] arr, int n, int k) {
        for (int i = k; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("mang sau Khi xoa ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
