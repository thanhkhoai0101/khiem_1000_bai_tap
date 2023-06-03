package com.example.khiem_1000_bai_tap.bai233;

import java.util.Scanner;

public class Bai233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        tAnSuat(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Gia Tri Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTmaNg(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkTrung(int[] arr, int id) {
        for (int i = id - 1; i >= 0; i--) {
            if (arr[i] == arr[id]) {
                return false;
            }
        }
        return true;
    }

    public static void tAnSuat(int[] arr, int n) {
        int dem;
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = i ; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            if (checkTrung(arr, i)) {
                System.out.println(arr[i] + " Xuat hien " + dem + " lan");
            }
        }
    }

}
