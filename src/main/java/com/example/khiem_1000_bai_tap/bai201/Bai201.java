package com.example.khiem_1000_bai_tap.bai201;

import java.util.Scanner;

public class Bai201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu N ");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        System.out.println("Tong Cac Gt duong cua Mang la " + tongGTdau(arr, n));

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static float tongGTdau(float[] arr, int n) {
        float tong = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                tong += arr[i];
            }
        }
        return tong;
    }
}
