package com.example.khiem_1000_bai_tap.bai342;

import java.util.Scanner;

public class Bai342 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("SL GT Cuc Dai la " + demCucDai(arr, dong, cot));
    }

    public static void nhap(int[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhap dong %d va cot %d ", i, j);
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

    public static boolean checkND(int[][] arr, int i, int j) {
        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]
                && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j]) {
            return true;
        }
        return false;
    }

    public static int demCucDai(int[][] arr, int dong, int cot) {
        int dem = 0;
        for (int i = 1; i < dong - 1; i++) {
            for (int j = 1; j < cot - 1; j++) {
                if (checkND(arr, i, j)) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
