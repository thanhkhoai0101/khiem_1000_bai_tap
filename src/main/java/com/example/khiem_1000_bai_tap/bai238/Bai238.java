package com.example.khiem_1000_bai_tap.bai238;

import java.util.Scanner;

public class Bai238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        lietKe(arr, n);


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

    public static int xuatHienNhieunhat(int[] arr, int n) {
        int dem;
        int max = 1;
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            if (dem > max) {
                max = dem;
            }
        }
        return max;
    }

    public static boolean checkBiTrung(int[] arr, int id) {
        for (int i = id - 1; i >= 0; i--) {
            if (arr[i] == arr[id]) {
                return false;
            }
        }
        return true;
    }

    public static void lietKe(int[] arr, int n) {
        int dem;
        int max = xuatHienNhieunhat(arr, n);
        System.out.println("Cac GT xuat hien nhieu nhat la ");
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            if (checkBiTrung(arr, i) && dem == max) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
