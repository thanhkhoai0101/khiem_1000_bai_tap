package com.example.khiem_1000_bai_tap.bai337;

import java.util.Scanner;

public class Bai337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong va so cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xUat(arr, dong, cot);
        System.out.println("SL chu So trong Ma tran la " + demLSLChuSo(arr, dong, cot));


    }

    public static void nhap(int[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println(" Nhap GT dong " + i + " cot " + j);
                arr[i][j] = scanner.nextInt();
                while (arr[i][j] < 0) {
                    System.out.println("Nhap lai GT > 0");
                    arr[i][j] = scanner.nextInt();
                }
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

    public static int demLSLChuSo(int[][] arr, int dong, int cot) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                int t = arr[i][j];
                while (t > 0) {
                    t /= 10;
                    dem++;
                }
            }
        }
        return dem;
    }
}
