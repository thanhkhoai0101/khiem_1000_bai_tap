package com.example.khiem_1000_bai_tap.bai263;

import java.util.Scanner;

public class Bai263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        sxAmDuong(arr, n);

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

    public static void sxAmDuong(int[] arr, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > 0 && arr[i] > arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            } else {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < 0 && arr[i] > arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            }
        }
        System.out.println("Cac Phan tu sau khi sap xep am duong tang dan ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
