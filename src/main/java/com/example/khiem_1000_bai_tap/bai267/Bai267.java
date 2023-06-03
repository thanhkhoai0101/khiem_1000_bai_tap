package com.example.khiem_1000_bai_tap.bai267;

import java.util.Scanner;

public class Bai267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);

    }

    public static boolean tonTaiX(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                return true;
            }
        }
        return false;
    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < n) {
            System.out.println("Nhap Phan tu thu " + i);
            int x = scanner.nextInt();
            if (tonTaiX(arr, i, x)) {
                System.out.println("Nhap Lai GT giam dan ");
            } else {
                arr[i] = x;
                i++;
            }
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
