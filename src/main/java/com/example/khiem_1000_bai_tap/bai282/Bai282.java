package com.example.khiem_1000_bai_tap.bai282;

import java.util.Scanner;

public class Bai282 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        chiaHetChoBa(arr, n);


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

    public static void chiaHetChoBa(int[] arr, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                a = arr[i];
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = a;
            }
        }
        System.out.println("Mang sau khi dua so chia het cho 3 ve dau ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
