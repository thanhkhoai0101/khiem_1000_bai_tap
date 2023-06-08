package com.example.khiem_1000_bai_tap.bai213;

import java.util.Scanner;

public class Bai213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        System.out.println("Nhap X ");
        float x = scanner.nextFloat();
        float trungBinh = tbLonHon(arr, n, x);
        if (trungBinh == 0) {
            System.out.println("Khong co GT  nao lon hon x");
        } else {
            System.out.println("Trung Binh Cong cac GT lon hon X la " + trungBinh);
        }

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static float tbLonHon(float[] arr, int n, float x) {
        float tong = 0;
        float tbc = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                tong += arr[i];
                tbc++;
            }
        }
        return tong / tbc;
    }
}
