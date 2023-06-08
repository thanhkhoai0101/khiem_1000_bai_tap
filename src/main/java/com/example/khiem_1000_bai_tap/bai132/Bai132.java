package com.example.khiem_1000_bai_tap.bai132;

import java.util.Scanner;

public class Bai132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[100];
        System.out.println("Nhap vao So luong Mang N");
        int n = scanner.nextInt();
        while (n >= 100) {
            System.out.println("nhap lai n <100 ");
            n = scanner.nextInt();
        }
        nhapMang(mang, n);
        xuatMang(mang, n);
        soChan(mang, n);
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu mang");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }

    public static void soChan(int[] mang, int n) {
        System.out.println("cac so chan trong mang la ");
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " ");
            }
        }
    }


}
