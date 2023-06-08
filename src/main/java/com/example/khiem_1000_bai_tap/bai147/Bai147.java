package com.example.khiem_1000_bai_tap.bai147;

import java.awt.*;
import java.util.Scanner;

public class Bai147 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nhapMang(mang, n);
        int soDuong = soDuongCuoi(mang, n);
        if (soDuong == -1) {
            System.out.println("Khong co SO duong nao " + soDuong);
        } else {
            System.out.println("So duong cuoi cung la " + soDuong);
        }


    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soDuongCuoi(int[] mang, int n) {
        for (int i = n - 1; i >= 0; i--) {
            if (mang[i] > 0) {
                return mang[i];
            }
        }
        return -1;
    }

}
