package com.example.khiem_1000_bai_tap.bai228;

import java.util.Scanner;

public class Bai228 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Mang n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        int dem = demGiaTri(arr, n);
        if (dem == 0) {
            System.out.println("Khong co gt nao thoa man dk " + 0);
        } else {
            System.out.println("Sl Gt nam sau cung dau &&|>| truoc la " + dem);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int demGiaTri(int[] arr, int n) {
        int dem = 0;
        for (int i = 1; i < n ; i++) {
            if (arr[i] > 0 && arr[i - 1] > 0 && arr[i] > arr[i - 1] ||
                    arr[i] < 0 && arr[i - 1] < 0 && Math.abs(arr[i]) > Math.abs(arr[i - 1])) {
                dem++;
            }
        }
        return dem;
    }
}
