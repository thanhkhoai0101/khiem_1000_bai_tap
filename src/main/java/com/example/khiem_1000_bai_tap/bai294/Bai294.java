package com.example.khiem_1000_bai_tap.bai294;

import java.util.Scanner;

public class Bai294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        mangConLOnHonHai(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap PT thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mangConLOnHonHai(int[] arr, int n) {
        System.out.println("MAng con co do dai > 2 la ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
