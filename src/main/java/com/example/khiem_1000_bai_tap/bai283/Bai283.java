package com.example.khiem_1000_bai_tap.bai283;

import java.util.Scanner;

public class Bai283 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        daoNguocMang(arr, n);

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

    public static void daoNguocMang(int[] arr, int n) {
        int a;
        for (int i = 0; i < n / 2; i++) {
            a = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = a;
        }
        System.out.println("mang dao nguoc");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
