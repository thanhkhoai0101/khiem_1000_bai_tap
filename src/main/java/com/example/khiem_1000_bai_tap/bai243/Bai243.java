package com.example.khiem_1000_bai_tap.bai243;

import java.util.Scanner;

public class Bai243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (tontaiSNT(arr, n) == 1) {
            System.out.println("Ton Tai GT SNT " + 1);
        } else {
            System.out.println("Khong ton tai Gt SNT " + 0);
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

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int tontaiSNT(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (checkSNT(arr[i])) {
                return 1;
            }
        }
        return 0;
    }
}
