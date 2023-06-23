package com.example.khiem_1000_bai_tap.bai306;

import java.util.Scanner;

public class Bai306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        tongLn(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int timMax(int[] arr, int n) {
        int max = 0;
        int tong;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                tong = 0;
                for (int k = i; k <= j; k++) {
                    tong += arr[k];
                }
                if (tong > max) {
                    max = tong;
                }
            }
        }
        return max;
    }

    public static void tongLn(int[] arr, int n) {
        int tong = 0;
        int max = timMax(arr, n);
        System.out.println("Mang con co tong LN la ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                tong = 0;
                for (int k = i; k <= j; k++) {
                    tong += arr[k];
                }
                if (tong == max) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
