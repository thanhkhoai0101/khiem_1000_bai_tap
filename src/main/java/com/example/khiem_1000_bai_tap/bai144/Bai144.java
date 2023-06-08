package com.example.khiem_1000_bai_tap.bai144;

import java.util.Scanner;

public class Bai144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[100];
        System.out.println("Nhap vao so luong mang N :");
        int n = scanner.nextInt();
        nhapMang(mang, n);
        xuatMang(mang, n);
        int sNt = songuyenTodautien(mang, n);
        if (sNt == -1) {
            System.out.println("khong co so nguyen to " + sNt);
        } else {
            System.out.println("So nguyen to dau tien la " + sNt);
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }

    public static int songuyenTodautien(int[] mang, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < mang[i]; j++) {
                if (mang[i] > 1 && mang[i] % j == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                return mang[i];
            }
            dem = 0;
        }
        return -1;
    }

}
