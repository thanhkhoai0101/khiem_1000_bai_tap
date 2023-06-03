package com.example.khiem_1000_bai_tap.bai281;

import java.util.Scanner;

public class Bai281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        chanDauLeCuoi(arr, n);

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

    public static void chanDauLeCuoi(int[] arr, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                a = arr[i];
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = a;
            }
        }
        System.out.println("Mang sau khi dua GT chan Ve Dau GT le Ve cuoi va 0 o giua ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
