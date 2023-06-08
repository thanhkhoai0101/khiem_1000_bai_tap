package com.example.khiem_1000_bai_tap.bai148;

import java.awt.*;
import java.util.Scanner;

public class Bai148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[100];
        int n = scanner.nextInt();
        nhapMang(mang, n);
        int sNt = soNTcuoi(mang, n);
        if (sNt == -1) {
            System.out.println("Khong co so nguyen to nao " + sNt);
        } else {
            System.out.println("So NT cuoi cung la " + sNt);
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soNTcuoi(int[] mang, int n) {
        int dem = 0;
        for (int i = n - 1; i >= 0; i--) {
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
