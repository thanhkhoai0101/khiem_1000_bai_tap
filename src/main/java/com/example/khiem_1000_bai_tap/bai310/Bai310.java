package com.example.khiem_1000_bai_tap.bai310;

import java.util.Scanner;

public class Bai310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL PT");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        int[] arr2 = new int[n];
        taoMangB(arr, n, arr2);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap PT thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        System.out.print("Mang A = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkSNT(int n) {
        if (n < 2) return false;
        if (n > 2) {
            if (n % 2 == 0) return false;
            for (int i = 3; i < n; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static void taoMangB(int[] arr, int n, int[] arr2) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkSNT(arr[i])) {
                arr2[dem] = arr[i];
                dem++;
            }
        }
        System.out.print("Mang B = ");
        for (int i = 0; i < dem; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
