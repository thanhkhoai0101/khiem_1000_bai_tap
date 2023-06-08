package com.example.khiem_1000_bai_tap.bai195;

import java.util.Scanner;

public class Bai195 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        nhapMang(arr, n);
        lietKe(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < n) {
            System.out.println("Nhap phan tu thu " + i);
            int x = scanner.nextInt();
            if (tonTai(arr, i + 1, x)) {
                System.out.println("Nhap lai phan tu " + i);
            } else {
                arr[i] = x;
                i++;
            }

        }
    }

    private static boolean tonTai(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void lietKe(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] == arr[j] || arr[i] == arr[k]) {
                        continue;
                    }
                    if (arr[i] == arr[j] + arr[k]) {

                        System.out.print(arr[i] + "," + arr[j] + "," + arr[k] + " ");
                        System.out.println();

                    }
                }

            }

        }
    }
}
