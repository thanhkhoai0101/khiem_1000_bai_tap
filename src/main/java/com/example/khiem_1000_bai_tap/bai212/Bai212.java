package com.example.khiem_1000_bai_tap.bai212;

import java.util.Scanner;

public class Bai212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        float tRungBinh = tBc_soDuong(arr, n);
        if (tRungBinh == 0) {
            System.out.println("Khong co so duong trong mang ");
        } else {
            System.out.println("trung binh cong cac so duong trong mang la  " + tRungBinh);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("nhap Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static float tBc_soDuong(int[] arr, int n) {
        float tong = 0;
        float tB = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                tong += arr[i];
                tB++;
            }
        }
        return tong / tB;
    }
}
