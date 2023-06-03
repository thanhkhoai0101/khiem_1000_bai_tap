package com.example.khiem_1000_bai_tap.bai224;

import java.util.Scanner;

public class Bai224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        int a = demHoanThien(arr, n);
        if (a == 0) {
            System.out.println("Khong co so hoan thien nao trong mang " + 0);
        } else {
            System.out.println("SL so hoan thien trong mang la " + a);
        }

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Gia Tri Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTmaNg(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkHoanThien(float n) {
        float tong = 0;
        if (n<6){
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static int demHoanThien(float[] arr, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkHoanThien(arr[i])) {
                dem++;
            }
        }
        return dem;
    }

}
