package com.example.khiem_1000_bai_tap.bai259;

import java.util.Scanner;

public class Bai259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        sxSoHTgiamDan(arr, n);

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

    public static boolean checkHoanThien(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static void sxSoHTgiamDan(int[] arr, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            if (checkHoanThien(arr[i])) {
                for (int j = i + 1; j < n; j++) {
                    if (checkHoanThien(arr[j]) && arr[i] < arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            }
        }
        System.out.println("Mang sau khi sap xep cac so hoan thien theo thu tu giam dan ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
