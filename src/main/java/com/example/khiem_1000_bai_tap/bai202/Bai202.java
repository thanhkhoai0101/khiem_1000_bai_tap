package com.example.khiem_1000_bai_tap.bai202;

import java.util.Scanner;

public class Bai202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        System.out.println("Tong Cac Gt co so dau la le cua Mang la " + tongDauLe(arr, n));

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean checkLe(int n) {
        int t = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
        }
        if (t % 2 == 0) {
            return false;
        }
        return true;

    }

    public static int tongDauLe(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (checkLe(arr[i])) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
