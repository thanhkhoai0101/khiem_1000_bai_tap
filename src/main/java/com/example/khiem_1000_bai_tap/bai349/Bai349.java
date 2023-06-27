package com.example.khiem_1000_bai_tap.bai349;

import java.util.Scanner;

public class Bai349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        if (tonTaiSHT(arr, dong, cot)) {
            System.out.println("Ton Tai SHT ");
        } else {
            System.out.println("Khong Ton Tai SHT ");
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

    public static boolean checkSHT(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static boolean tonTaiSHT(int[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (checkSHT(arr[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
