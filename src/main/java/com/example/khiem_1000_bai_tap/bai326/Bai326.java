package com.example.khiem_1000_bai_tap.bai326;

import java.util.Scanner;

public class Bai326 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        if (tBCsoDuong(arr, dong, cot) == -1) {
            System.out.print("Ma tran Khong co so duong ");
        } else {
            System.out.println("TBC Gt duong la " + tBCsoDuong(arr, dong, cot));
        }


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

    public static float tBCsoDuong(int[][] arr, int dong, int cot) {
        float tong = 0;
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (arr[i][j] > 0) {
                    tong += arr[i][j];
                    dem++;
                }
            }
        }
        if (dem==0){
            return -1;
        }
        return tong / dem;
    }
}
