package com.example.khiem_1000_bai_tap.bai200;

import java.util.Scanner;

public class Bai200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        System.out.println("Tong Cac Gt cua Mang la " + tongGT(arr, n));

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static int tongGT(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        return tong;
    }
}
