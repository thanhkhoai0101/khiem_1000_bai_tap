package com.example.khiem_1000_bai_tap.bai164;

import java.util.Scanner;

public class Bai164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        if (soGanh(arr, n) == 0) {
            System.out.println("Khong co gia tri nao la so ganh ");
        } else {
            System.out.println("gia tri dau tien co tinh chat so ganh la " + soGanh(arr, n));
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean checksoDao(int n) {
        int t;
        int soDao = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
            soDao = soDao * 10 + t;
        }
        if (soDao != n || soDao < 10) {
            return false;
        }
        return true;
    }

    public static int soGanh(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (checksoDao(arr[i])) {
                return arr[i];
            }
        }
        return 0;
    }
}
