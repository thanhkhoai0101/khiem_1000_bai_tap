package com.example.khiem_1000_bai_tap.bai203;

import java.util.Scanner;

public class Bai203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        System.out.println("Tong Cac Gt co so hang chuc la 5 cua Mang la " + tong(arr, n));

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean checkso5(int n) {
        if (n < 50) {
            return false;
        }
        int i = 0;
        int t = 0;
        while (i < 2) {
            t = n % 10;
            n = n / 10;
            i++;
        }
        if (t != 5) {
            return false;
        }
        return true;
    }

    public static int tong(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (checkso5(arr[i])) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
