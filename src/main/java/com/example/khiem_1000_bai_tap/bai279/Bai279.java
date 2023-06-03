package com.example.khiem_1000_bai_tap.bai279;

import java.util.Scanner;

public class Bai279 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        xoaTrungTatCa(arr, n);


    }

    public static void nhaPManG(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTManG(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void xoaTrungTatCa(int[] arr, int n) {
        int dem;
        int xoa = 0;
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                    xoa = arr[i];
                }
            }
            if (dem > 1) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == xoa) {
                        for (int k = j; k < n - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        j--;
                        n--;
                    }
                }
            }
        }
        System.out.println("Mang sau khi xoa cac Gt xuat hien hon 1 lan  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
