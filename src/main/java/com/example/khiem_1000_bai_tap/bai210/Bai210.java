package com.example.khiem_1000_bai_tap.bai210;

import java.util.Scanner;

public class Bai210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N so luong mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        if (tongChanDau(arr, n) == 0) {
            System.out.println("khong co GT co so chan dau ");
        } else {
            System.out.println("tong cac GT co So chan Dau la " + tongChanDau(arr, n));
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean check_chanDau(int n) {
        int t = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
        }
        return t % 2 == 0;
    }

    public static int tongChanDau(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (check_chanDau(arr[i])) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
