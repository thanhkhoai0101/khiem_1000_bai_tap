package com.example.khiem_1000_bai_tap.bai181;

import java.util.Scanner;

public class Bai181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        lietKechan(mang, n);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void lietKechan(int[] mang, int n) {
        System.out.println("Gt chan thoa man dk la  ");
        int dem = 0;
        if (mang[0] % 2 == 0 && mang[1] % 2 == 0) {
            System.out.print(mang[0] + " ");
        }
        for (int i = 1; i < n - 1; i++) {
            if (mang[i] % 2 == 0 && mang[i + 1] % 2 == 0 || mang[i] % 2 == 0 && mang[i - 1] % 2 == 0) {
                System.out.print(mang[i] + " ");
            } else {
                dem++;
            }
        }
        if (mang[n - 1] % 2 == 0 && mang[n - 2] % 2 == 0) {
            System.out.print(mang[n - 1] + " ");
        }
        if (dem == n - 1) {
            System.out.println("Khong co GT thoa man ");
        }
    }
}
