package com.example.khiem_1000_bai_tap.bai354;

import java.util.Scanner;

public class bai354 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap dong va cot");
//        int dong = scanner.nextInt();
//        int cot = scanner.nextInt();
        int[][] arr = new int[3][4];
        //nhap(arr, dong, cot);
        arr = new int[][]{{87, 100, 62, 54}, {46, 40, 33, 28}, {20, 18, 15, 10}};
        xuat(arr, 3, 4);
        if (kTraGiamDan(arr, 3, 4)) {
            System.out.println("Ma tran Giam dan theo dong va cot");
        } else {
            System.out.println("Ma tran Khong Giam dan theo dong va cot");
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

    public static boolean kTraGiamDan(int[][] arr, int dong, int cot) {
        int n = dong * cot;
        int a, b, c, d;
        for (int i = 0; i < n - 1; i++) {
            a = i / cot;
            b = i % cot;
            c = (i + 1) / cot;
            d = (i + 1) % cot;
            if (arr[a][b] <= arr[c][d]) {
                return false;
            }
        }
        return true;
    }
}
