package com.example.khiem_1000_bai_tap.bai269;

import java.util.Scanner;

public class Bai269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        System.out.println("Nhap GT X");
        int x = scanner.nextInt();
        theBaoToan(arr, n, x);

    }

    public static void nhaPManG(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < n) {
            System.out.println("Nhap GT Phan Tu Tang dan " + i);
            int x = scanner.nextInt();
            if (tonTaiX(arr, i, x)) {
                System.out.println("Nhap Lai GT Tang Dan ");
            } else {
                arr[i] = x;
                i++;
            }
        }
    }

    public static boolean tonTaiX(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                return true;
            }
        }
        return false;
    }

    public static void xuaTManG(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void theBaoToan(int[] arr, int n, int x) {
        int a;
        arr[n] = x;
        for (int i = 0; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println("Mang sau khi them x va sap xep tang dan ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
