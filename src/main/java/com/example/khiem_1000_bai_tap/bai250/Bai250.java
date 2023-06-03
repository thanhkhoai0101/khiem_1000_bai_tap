package com.example.khiem_1000_bai_tap.bai250;

import java.util.Scanner;

public class Bai250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        int d = kTraCapSoCong(arr, n);
        if (d == 0) {
            System.out.println("Phan tu Mang khong phai cap so cong");
        } else {
            System.out.println("Mang co PT la cap so cong d = " + d);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int kTraCapSoCong(int[] arr, int n) {
        int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return 0;
            }
        }
        return d;
    }
}
