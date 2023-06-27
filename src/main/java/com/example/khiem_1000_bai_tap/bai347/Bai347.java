package com.example.khiem_1000_bai_tap.bai347;

import java.util.Scanner;

public class Bai347 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("SL GT Yen Ngua la " + demYenNgua(arr, dong, cot));
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

    public static boolean checkDong(int[][] arr, int i, int j, int cot) {
        for (int k = 0; k < cot; k++) {
            if (arr[i][j] < arr[i][k]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCot(int[][] arr, int dong, int i, int j) {
        for (int k = 0; k < dong; k++) {
            if (arr[i][j] > arr[k][j]) {
                return false;
            }
        }
        return true;
    }

    public static int demYenNgua(int[][] arr, int dong, int cot) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (checkDong(arr, i, j, cot) && checkCot(arr, dong, i, j)) {
                    dem++;
                }
            }
        }
        return dem;
    }

}
