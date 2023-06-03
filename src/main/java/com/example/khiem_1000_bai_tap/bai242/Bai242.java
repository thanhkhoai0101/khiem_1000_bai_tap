package com.example.khiem_1000_bai_tap.bai242;

import java.util.Scanner;

public class Bai242 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL phan Tu N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (tonTaiChan(arr, n) == 0) {
            System.out.println("Khong ton tai GT chan trong mang " + 0);
        } else {
            System.out.println("GT chan Ton Tai " + 1);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan Tu thu " + i);
            arr[i] = scanner.nextInt();
        }

    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int tonTaiChan(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                return 1;
            }
        }
        return 0;
    }
}
