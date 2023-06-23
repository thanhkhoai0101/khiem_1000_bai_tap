package com.example.khiem_1000_bai_tap.bai318;

import java.util.Scanner;

public class Bai318 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        float[][] arr = new float[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        System.out.println("Tong cac GT am trong ma tran = " + tongGTam(arr, dong, cot));

    }

    public static void nhap(float[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhap Dong " + i + " Cot " + j);
                arr[i][j] = scanner.nextFloat();
            }
        }
    }

    public static void xuat(float[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static float tongGTam(float[][] arr, int dong, int cot) {
        float tong = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (arr[i][j] < 0) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }
}
