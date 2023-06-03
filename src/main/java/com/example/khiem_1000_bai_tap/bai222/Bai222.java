package com.example.khiem_1000_bai_tap.bai222;

import java.util.Scanner;

public class Bai222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        int a = demCucTri(arr, n);
        if (a == 0) {
            System.out.println("Khong co GT nao thoa man ");
        } else {
            System.out.println("So luong GT cuc tri la " + a);
        }


    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Gia Tri Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTmaNg(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int demCucTri(int[] arr, int n) {
        int dem = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i+1] || arr[i] < arr[i-1] && arr[i] < arr[i + 1]) {
                dem++;
            }
        }
        return dem;
    }
}
