package com.example.khiem_1000_bai_tap.bai230;

import java.util.Scanner;

public class Bai230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        lietKeTansuat(arr, n);


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

    public static void lietKeTansuat(int[] arr, int n) {
        int dem;
        System.out.println("Tan suat xuat hien cac gia tri ");
        System.out.println("Gia Tri\t\tTan Suat");
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = i; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            System.out.println(arr[i] + "\t\t\t\t" + dem);
        }
    }

}
