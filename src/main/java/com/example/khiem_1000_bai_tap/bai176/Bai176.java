package com.example.khiem_1000_bai_tap.bai176;

import java.util.Scanner;

public class Bai176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        lietKesoAm(mang, n);


    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void lietKesoAm(int[] mang, int n) {
        System.out.print("Cac so am trong mang la ");
        for (int i = 0; i < n; i++) {
            if (mang[i] < 0) {
                System.out.print(mang[i]+" ");
            }
        }
    }
}
