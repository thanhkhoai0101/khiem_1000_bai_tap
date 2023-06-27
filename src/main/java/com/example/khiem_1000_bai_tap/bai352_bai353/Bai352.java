package com.example.khiem_1000_bai_tap.bai352_bai353;

import java.util.Scanner;

public class Bai352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Nhap hang Muon Kiem Tra ");
        int x = scanner.nextInt();
        System.out.println("Nhap Cot Muon Kiem traa");
        int y = scanner.nextInt();
        if (dongTangDan(arr, x, cot)) {
            System.out.println("Tan dan");
        } else {
            System.out.println("Khong Phai tang dan ");
        }
        if (cotGiam(arr, dong, y)) {
            System.out.println("Cot giam dan");
        } else {
            System.out.println("Cot Khong Giam Dan");
        }

    }

    public static void nhap(int[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhap dong %d cot %d ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuat(int[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean dongTangDan(int[][] arr, int x, int cot) {
        for (int i = cot - 1; i > 0; i--) {
            if (arr[x][i] <= arr[x][i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean cotGiam(int[][] arr, int dong, int y) {
        for (int i = 0; i < dong - 1; i++) {
            if (arr[i][y] <= arr[i + 1][y]) {
                return false;
            }
        }
        return true;
    }
}
