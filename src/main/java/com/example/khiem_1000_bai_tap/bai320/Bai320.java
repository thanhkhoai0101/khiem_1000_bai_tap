package com.example.khiem_1000_bai_tap.bai320;

import java.util.Scanner;

public class Bai320 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        out(arr, dong, cot);
        System.out.println("Tong cac so duong trong ma tran la " + tongDuong(arr, dong, cot));

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

    public static void out(int[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int tongDuong(int[][] arr, int dong, int cot) {
        int tong = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (arr[i][j] > 0) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }
}
