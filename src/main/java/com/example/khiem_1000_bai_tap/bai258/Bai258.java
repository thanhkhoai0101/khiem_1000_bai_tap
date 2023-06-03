package com.example.khiem_1000_bai_tap.bai258;

import java.util.Scanner;

public class Bai258 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        sXSoNTo(arr, n);

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

    public static boolean checkSNt(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sXSoNTo(int[] arr, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            if (checkSNt(arr[i])) {
                for (int j = i + 1; j < n; j++) {
                    if (checkSNt(arr[j]) && arr[i] > arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            }
        }
        System.out.println("Mang sau khi sx cac GT SNT tang dan ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
