package com.example.khiem_1000_bai_tap.bai275;

import java.util.Scanner;

public class Bai275 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        xoaSCP(arr, n);

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

    public static boolean checkSChinhPhuong(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void xoaSCP(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (checkSChinhPhuong(arr[i])) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        System.out.println("Mang sau khi xoa So chinh Phuong ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
