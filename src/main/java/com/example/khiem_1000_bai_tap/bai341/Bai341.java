package com.example.khiem_1000_bai_tap.bai341;

import java.util.Scanner;

public class Bai341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("SL so duong tren bien ma tran la " + demDuongBien(arr, dong, cot));
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

    public static int demDuongBien(int[][] arr, int dong, int cot) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == 0 || i == dong - 1 || j == 0 || j == cot - 1) {
                    if (arr[i][j] > 0) {
                        dem++;
                    }
                }
            }
        }
        return dem;
    }
}
