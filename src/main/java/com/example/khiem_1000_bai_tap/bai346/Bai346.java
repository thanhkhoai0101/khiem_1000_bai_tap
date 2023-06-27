package com.example.khiem_1000_bai_tap.bai346;

import java.util.Scanner;

public class Bai346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Dong Va cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("SL GT Hoang hau la " + demHoangHau(arr, dong, cot));

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
                System.out.printf(" %d\t", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkDong(int[][] arr, int x, int y, int cot) {
        for (int i = 0; i < cot; i++) {
            if (arr[x][y] < arr[x][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCot(int[][] arr, int x, int y, int dong) {
        for (int i = 0; i < dong; i++) {
            if (arr[x][y] < arr[i][y]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDuongCheo(int[][] arr, int x, int y, int dong, int cot) {
        int dongTru = x - 1;
        int cotTru = y - 1;
        int dongCong = x + 1;
        int cotCong = y + 1;

        while (dongTru >= 0 && cotTru >= 0) {
            if (arr[x][y] < arr[dongTru][cotTru]) {
                return false;
            }
            dongTru--;
            cotTru--;
        }
        while (dongCong < dong && cotCong < cot) {
            if (arr[x][y] < arr[dongCong][cotCong]) {
                return false;
            }
            dongCong++;
            cotCong++;
        }
        dongCong = x + 1;
        cotTru = y - 1;
        while (dongCong < dong && cotTru >= 0) {
            if (arr[x][y] < arr[dongCong][cotTru]) {
                return false;
            }
            dongCong++;
            cotTru--;
        }
        dongTru = x - 1;
        cotCong = y + 1;
        while (dongTru >= 0 && cotCong < cot) {
            if (arr[x][y] < arr[dongTru][cotCong]) {
                return false;
            }
            dongTru--;
            cotCong++;
        }

        return true;
    }

    public static int demHoangHau(int[][] arr, int dong, int cot) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (checkDong(arr, i, j, cot) && checkCot(arr, i, j, dong) && checkDuongCheo(arr, i, j, dong, cot)) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
