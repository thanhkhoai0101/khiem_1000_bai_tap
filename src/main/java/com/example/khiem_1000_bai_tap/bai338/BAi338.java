package com.example.khiem_1000_bai_tap.bai338;

import java.util.Scanner;

public class BAi338 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Nhap dong muon dem so duong ");
        int x = scanner.nextInt();
        System.out.println("SL so duong tren dong " + x + " la " + demDuong(arr, x, cot));

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

    public static int demDuong(int[][] arr, int x, int cot) {
        int dem = 0;
        for (int i = 0; i < cot; i++) {
            if (arr[x][i] > 0) {
                dem++;
            }
        }
        return dem;
    }
}
