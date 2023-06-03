package com.example.khiem_1000_bai_tap.bai239;

import java.util.Scanner;

public class Bai239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        int dem = demSNTphanBiet(arr, n);
        if (dem == 0) {
            System.out.println("Khong co SNT phan biet Nao ");
        } else {
            System.out.println("SL SNT phan biet la " + dem);
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

    public static int demSNTphanBiet(int[] arr, int n) {
        int dem = 0;
        int a;
        for (int i = 0; i < n; i++) {
            a = 0;
            for (int j = 0; j < n; j++) {
                if (checkSNT(arr[i]) && arr[i] == arr[j]) {
                    a++;
                }
            }
            if (a == 1) {
                dem++;
            }
        }
        return dem;
    }
}
