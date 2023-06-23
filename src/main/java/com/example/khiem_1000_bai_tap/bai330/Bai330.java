package com.example.khiem_1000_bai_tap.bai330;

import java.util.Scanner;

public class Bai330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        float[][] arr = new float[dong][cot];
        nhap(arr, dong, cot);
        xuat(arr, dong, cot);
        int[][] arr1 = new int[dong][cot];
        nguyenHoa(arr, arr1, dong, cot);


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

    public static void nguyenHoa(float[][] arr, int[][] arr1, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                arr1[i][j] = (int) Math.floor(arr[i][j]);
                if (arr[i][j] - arr1[i][j] >= 0.5) {
                    arr1[i][j] += 1;
                }
            }
        }
        System.out.println("mang sau khi bien doi ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
