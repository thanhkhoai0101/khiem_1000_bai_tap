package com.example.khiem_1000_bai_tap.bai261;

import java.util.Scanner;

public class Bai261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang ");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhApManG(arr, n);
        xUatManG(arr, n);
        sXSoDuong(arr, n);

    }

    public static void nhApManG(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static void xUatManG(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " \t");
        }
        System.out.println();
    }

    public static void sXSoDuong(float[] arr, int n) {
        float a;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > 0 && arr[i] > arr[j]) {
                        a = arr[i];
                        arr[i] = arr[j];
                        arr[j] = a;
                    }
                }
            }
        }
        System.out.println("Cac GT sau khi sap xep so duong tang dan ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " \t");
        }
    }
}
