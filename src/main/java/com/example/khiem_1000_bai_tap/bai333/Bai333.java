package com.example.khiem_1000_bai_tap.bai333;

import java.util.Scanner;

public class Bai333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong va so cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xUat(arr, dong, cot);
        System.out.println("tong cac so hoan thien trong ma tran la " + tongSHT(arr, dong, cot));

    }

    public static void nhap(int[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println(" Nhap GT dong " + i + " cot " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xUat(int[][] arr, int dong, int cot) {
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

    public static int tongSHT(int[][] arr, int dong, int cot) {
        int tong = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (checkSHT(arr[i][j])) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }
}
