package com.example.khiem_1000_bai_tap.bai260;

import java.util.Scanner;

public class Bai260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So luong Cua mang  ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        nHapMang(arr1, arr2, n);
        xUatMang(arr1, arr2, n);
        sapXepAB(arr1, arr2, n);
        int KT = kiemTra(arr1, arr2, n);
        if (KT == 0) {
            System.out.println("Mang B khong Phai Hoan Vi Cua Mang A ");
        } else {
            System.out.println("Mang B la Hoan Vi cua mang A ");
        }

    }

    public static void nHapMang(int[] arr1, int[] arr2, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap PT mang A " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Mang phan tu B " + i);
            arr2[i] = scanner.nextInt();
        }
    }

    public static void xUatMang(int[] arr1, int[] arr2, int n) {
        System.out.print("Mang A = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Mang B = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void sapXepAB(int[] arr1, int[] arr2, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] < arr1[j]) {
                    a = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = a;
                }
                if (arr2[i] < arr2[j]) {
                    a = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = a;
                }
            }
        }
    }

    public static int kiemTra(int[] arr1, int[] arr2, int n) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return 0;
            }
        }
        return 1;
    }
}
