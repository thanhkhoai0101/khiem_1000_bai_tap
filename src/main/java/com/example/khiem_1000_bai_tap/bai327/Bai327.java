package com.example.khiem_1000_bai_tap.bai327;

import java.util.Scanner;

public class Bai327 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Tong vien ma tran " + tongBienMaTran(arr, dong, cot));

    }

    public static void nhap(int[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhap Dong " + i + " Cot " + j);
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
        System.out.println();
    }

    public static int tongBienMaTran(int[][] arr, int dong, int cot) {
        int tong = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == 0 || i == dong - 1 || j == 0 || j == cot - 1) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }
}
