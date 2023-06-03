package com.example.khiem_1000_bai_tap.bai276;

import java.util.Scanner;

public class Bai276 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        System.out.println("Nhap GT muon xoa X ");
        int x = scanner.nextInt();
        xoaTrungX(arr, n, x);

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

    public static void xoaTrungX(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        System.out.println("mang sau Khi xoa GT trung voi X ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
