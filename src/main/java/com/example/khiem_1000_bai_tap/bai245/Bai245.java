package com.example.khiem_1000_bai_tap.bai245;

import java.util.Scanner;

public class Bai245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        if (ktToanChan(arr, n) == 0) {
            System.out.println("Ton Tai GT le " + 0);
        } else {
            System.out.println("Mang toan GT chan " + 1);
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

    public static int ktToanChan(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
