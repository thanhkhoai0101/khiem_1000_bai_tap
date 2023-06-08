package com.example.khiem_1000_bai_tap.Bai140;

import java.util.Scanner;

public class Bai140 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 5);
        xuatMang(mang, 5);
        int sNN = soDuongNN(mang, 5);
        if (sNN == -1) {
            System.out.println("khong co gia tri duong nao ");
            for (int i = 0; i < 10; i++) {
                mang[i] = -1;
                System.out.print(mang[i] + " ");
            }
        } else {
            System.out.print("So duong nho nhat la " + sNN);
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

    public static int soDuongNN(int[] mang, int n) {
        int sNN = mang[0];


        for (int i = 0; i < n; i++) {
            if ((mang[i] < sNN && mang[i] > 0) || sNN < 0) {
                sNN = mang[i];
            }

        }
        if (sNN > 0) {
            return sNN;
        } else {
            return -1;
        }

    }

}
