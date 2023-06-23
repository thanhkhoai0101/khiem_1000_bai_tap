package com.example.khiem_1000_bai_tap.bai322_bai324;

import java.util.Scanner;

public class Bai322_Bai324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Nhap dong muon tinh tong");
        int a = scanner.nextInt();
        a = a - 1;
        System.out.printf("Tong GT duong cua dong %d La %d ", a+1, tongMotDong(arr, a, cot));

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

    public static int tongMotDong(int[][] arr, int a, int cot) {
        int tong = 0;
        for (int i = 0; i < cot; i++) {
            if (arr[a][i] > 0) {
                tong += arr[a][i];
            }
        }
        return tong;
    }
}
