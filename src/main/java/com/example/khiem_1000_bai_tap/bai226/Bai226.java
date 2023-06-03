package com.example.khiem_1000_bai_tap.bai226;

import java.util.Scanner;

public class Bai226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL phan Tu N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        int dem = demKeChan(arr, n);
        if (dem == 0) {
            System.out.println("Khong co Gia tri Chan nao ke Nhau ");
        } else {
            System.out.println("SL GT chan Ke nhau La " + dem);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println();
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int demKeChan(int[] arr, int n) {
        int dem = 0;
        if (arr[0] % 2 == 0 && arr[1] % 2 == 0) {
            dem++;
        }
        if (arr[n - 1] % 2 == 0 && arr[n - 2] % 2 == 0) {
            dem++;
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i - 1] % 2 == 0 || arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                dem++;
            }
        }
        return dem;
    }
}
