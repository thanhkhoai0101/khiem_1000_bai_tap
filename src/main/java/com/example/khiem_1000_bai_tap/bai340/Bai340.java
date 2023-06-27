package com.example.khiem_1000_bai_tap.bai340;

import java.util.Scanner;

public class Bai340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Nhap cot muon dem so am ");
        int x = scanner.nextInt();
        while (x < 0 || x >= cot) {
            System.out.println("Nhap Lai cot ");
            x = scanner.nextInt();
        }
        System.out.println("SL SO am tren cot " + x + " la " + demAm(arr, dong, x));

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

    public static int demAm(int[][] arr, int dong, int x) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            if (arr[i][x] < 0) {
                dem++;
            }
        }
        return dem;
    }
}
