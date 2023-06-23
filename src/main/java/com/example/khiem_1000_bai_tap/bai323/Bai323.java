package com.example.khiem_1000_bai_tap.bai323;

import java.util.Scanner;

public class Bai323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Nhap Cot muon tinh tich ");
        int a = scanner.nextInt();
        if (tichGTDuongCot(arr, dong, a) == 1) {
            System.out.println("Cot nay khong co so duong ");
        } else {
            System.out.printf("Tich so duong cua cot %d la %d ", a, tichGTDuongCot(arr, dong, a));
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

    public static int tichGTDuongCot(int[][] arr, int dong, int a) {
        int tich = 1;
        for (int i = 0; i < dong; i++) {
            if (arr[i][a] > 0) {
                tich *= arr[i][a];
            }
        }
        return tich;
    }
}
