package com.example.khiem_1000_bai_tap.bai211;

import java.util.Scanner;

public class Bai211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong PT N ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMaNG(arr, n);
        float tong = tBc_sNt(arr, n);
        if (tong == 0) {
            System.out.println("khong co snt trong mang " + 0);
        } else {
            System.out.println("Trung Binh Cong cac so nguyen To trong mang la " + tong);
        }

    }

    public static void nhapMaNG(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean check_SNTo(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
        }
        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static float tBc_sNt(int[] arr, int n) {
        float tong = 0;
        float TBC = 0;
        for (int i = 0; i < n; i++) {
            if (check_SNTo(arr[i])) {
                tong += arr[i];
                TBC++;
            }
        }
        return tong / TBC;
    }
}
