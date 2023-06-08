package com.example.khiem_1000_bai_tap.bai209;

import java.util.Scanner;

public class Bai209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL phan Tu N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhApmAng(arr, n);
        int tong = tong_DoiXuNg(arr, n);
        if (tong == 0) {
            System.out.println("Khong co so doi xung trong mang " + 0);
        } else {
            System.out.println("tong cac So doi xung trong mang la " + tong);
        }
    }

    public static void nhApmAng(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean check_dOixUng(int n) {
        int t = 0;
        int Dx = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
            Dx = Dx * 10 + t;
        }
        return Dx == n;
    }

    public static int tong_DoiXuNg(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (check_dOixUng(arr[i])) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
