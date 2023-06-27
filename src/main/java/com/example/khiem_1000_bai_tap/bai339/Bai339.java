package com.example.khiem_1000_bai_tap.bai339;

import java.util.Scanner;

public class Bai339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong va cot");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Nhap dong muon dem so hoan thien ");
        int x = scanner.nextInt();
        while (x < 0 || x >= dong) {
            System.out.println("Nhap lai dong ");
            x = scanner.nextInt();
        }
        System.out.println("SL SHT tren dong " + x + " la " + demSHT(arr, x, cot));
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

    public static int demSHT(int[][] arr, int x, int cot) {
        int dem = 0;
        for (int i = 0; i < cot; i++) {
            if (checkSHT(arr[x][i])) {
                dem++;
            }
        }
        return dem;
    }
}
