package com.example.khiem_1000_bai_tap.bai219;

import java.util.Scanner;

public class Bai219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        System.out.println("NHap X");
        int x = scanner.nextInt();
        System.out.println("So lan xuat hien cua " + x + " la " + tanXuat(arr, n, x)+" lan");


    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static int tanXuat(float[] arr, int n, int x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                dem++;
            }
        }
        return dem;
    }
}
