package com.example.khiem_1000_bai_tap.bai336;

import java.util.Scanner;

public class Bai336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong va so cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xUat(arr, dong, cot);
        System.out.println("Nhap GT X");
        int x = scanner.nextInt();
        System.out.println(x + " Xuat Hien trong ma tran " + tanSuatX(arr, dong, cot, x)+" lan ");

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

    public static int tanSuatX(int[][] arr, int dong, int cot, int x) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (arr[i][j] == x) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
