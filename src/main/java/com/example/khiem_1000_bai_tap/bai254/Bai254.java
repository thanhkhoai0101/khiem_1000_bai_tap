package com.example.khiem_1000_bai_tap.bai254;

import java.util.Scanner;

public class Bai254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        System.out.println("SL Phan Tu Lon Hon Tat Ca cac Gia Tri o truoc no la " + demLonHon(arr, n));

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

    public static boolean kTraLonHon(int[] arr, int id) {
        for (int i = id - 1; i >= 0; i--) {
            if (arr[i] >= arr[id]) {
                return false;
            }
        }
        return true;
    }

    public static int demLonHon(int[] arr, int n) {
        int dem = 0;
        for (int i = 1; i < n; i++) {
            if (kTraLonHon(arr, i)) {
                dem++;
            }
        }
        return dem;
    }
}
