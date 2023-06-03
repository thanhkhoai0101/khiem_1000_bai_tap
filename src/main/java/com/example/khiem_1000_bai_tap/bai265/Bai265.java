package com.example.khiem_1000_bai_tap.bai265;

import java.util.Scanner;

public class Bai265 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N va M ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        int[] arr3 = new int[n + m];
        nhaPManG(arr, arr2, n, m);
        xuaTManG(arr, arr2, n, m);
        tronMang(arr, arr2, arr3, n, m);
        tRonGiam(arr3, m, n);


    }

    public static void nhaPManG(int[] arr, int[] arr2, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Phan Tu Mang N va M Tang Dan ");
        int i = 0;
        while (i < n) {
            System.out.println("Nhap Phan tu Mang N thu " + i);
            int x = scanner.nextInt();
            if (tOnTaiX(arr, i, x)) {
                System.out.println("Nhap Lai GT Tang dan ");
            } else {
                arr[i] = x;
                i++;
            }
        }
        int j = 0;
        while (j < m) {
            System.out.println("Nhap Phan Tu Mang M thu " + j);
            int c = scanner.nextInt();
            if (tOnTaiX(arr2, i, c)) {
                System.out.println("Nhap Lai Gt Tang dan ");
            } else {
                arr2[j] = c;
                j++;
            }
        }
    }

    public static void xuaTManG(int[] arr, int[] arr2, int n, int m) {
        System.out.print("Mang N Tang Dan = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Mang M Tang Dan = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static boolean tOnTaiX(int[] a, int b, int x) {
        for (int i = 0; i < b; i++) {
            if (a[i] >= x) {
                return true;
            }
        }
        return false;
    }

    public static void tronMang(int[] arr, int[] arr2, int[] arr3, int n, int m) {
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[i + n] = arr2[i];
        }
        System.out.println("Hai Mang sau khi tron Lai ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }

    public static void tRonGiam(int[] arr3, int m, int n) {
        for (int i = 0; i < m + n; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (arr3[i] < arr3[j]) {
                    int a = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = a;
                }
            }
        }
        System.out.println("Mang Tron sau khi sap xep Giam dan ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
