package com.example.khiem_1000_bai_tap.bai229;

import java.util.Scanner;

public class Bai229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        int dem = demPhanBiet(arr, n);
        if (dem == 0) {
            System.out.println("Khong co Gt phan biet nao " + 0);
        } else {
            System.out.println("Sl GT phan biet la " + dem);
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

    public static int demPhanBiet(int[] arr, int n) {
        int dem = 0;
        int a;
        for (int i = 0; i < n; i++) {
            a = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
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
