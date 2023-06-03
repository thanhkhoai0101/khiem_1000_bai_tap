package com.example.khiem_1000_bai_tap.bai262;

import java.util.Scanner;

public class Bai262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        sapXepChanLe(arr, n);

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

    public static void sapXepChanLe(int[] arr, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 == 0 && arr[i] > arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            } else {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 != 0 && arr[i] > arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            }
        }
        System.out.println("Cac Phan Tu sau khi sap xep chan le tang dan ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}
