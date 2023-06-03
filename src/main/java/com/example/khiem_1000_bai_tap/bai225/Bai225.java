package com.example.khiem_1000_bai_tap.bai225;

import java.util.Scanner;

public class Bai225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        System.out.println("SL cac Gt Ln la " + demMax(arr, n));

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Gia Tri Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTmaNg(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static float gTLn(float[] arr, int n) {
        float max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int demMax(float[] arr, int n) {
        int dem = 0;
        float max = gTLn(arr, n);
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                dem++;
            }
        }
        return dem;
    }
}
