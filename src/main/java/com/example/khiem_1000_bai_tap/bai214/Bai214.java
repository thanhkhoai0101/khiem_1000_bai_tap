package com.example.khiem_1000_bai_tap.bai214;

import java.util.Scanner;

public class Bai214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        if (trungBinhNhan(arr, n) == 0) {
            System.out.println("Khong co GT nao duong ");
        } else {
            System.out.println("TB nhan Cac GT duong la " + trungBinhNhan(arr, n));
        }

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static float trungBinhNhan(float[] arr, int n) {
        float tich = 1;
        float tbn = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                tich *= arr[i];
                tbn++;
            }
        }
        return tich / tbn;
    }
}
