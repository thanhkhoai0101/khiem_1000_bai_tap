package com.example.khiem_1000_bai_tap.bai308;

import java.util.Scanner;

public class Bai308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NhapSl Mang A ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        mangB(arr, n, arr2);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mangB(int[] arr, int n, int[] arr2) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr2[dem] = arr[i];
                dem++;
            }
        }
        System.out.println("Mang B =");
        for (int i = 0; i < dem; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
