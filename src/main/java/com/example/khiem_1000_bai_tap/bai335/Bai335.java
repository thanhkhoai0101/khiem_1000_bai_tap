package com.example.khiem_1000_bai_tap.bai335;

import java.util.Scanner;

public class Bai335 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong va so cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xUat(arr, dong, cot);
        System.out.println("SL SNT trong ma tran la " + demSNT(arr, dong, cot));

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

    public static boolean checkSNT(int n) {
        if (n < 2) return false;
        if (n > 2) {
            if (n % 2 == 0) return false;
            for (int i = 3; i < n; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static int demSNT(int[][] arr, int dong, int cot) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (checkSNT(arr[i][j])) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
