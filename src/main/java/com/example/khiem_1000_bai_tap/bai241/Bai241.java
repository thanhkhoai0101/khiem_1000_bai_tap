package com.example.khiem_1000_bai_tap.bai241;

import java.util.Scanner;

public class Bai241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (haiKo(arr, n) == 1) {
            System.out.println("Ton Tai 2 GT 0 lien tiep " + 1);
        } else {
            System.out.println("Khong ton tai 2GT 0 lien Tiep " + 0);
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

    public static int haiKo(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return 1;
            }
        }
        return 0;
    }
}
