package com.example.khiem_1000_bai_tap.bai179;

import java.util.Scanner;

public class Bai179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        lietKeSL(mang, n);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void lietKeSL(int[] mang, int n) {
        System.out.println("Số Lớn Hơn GTTD của Số Liền kề là ");
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            if (mang[i] > Math.abs(mang[i + 1])) {
                System.out.print(mang[i] + " ");
            } else {
                dem++;
            }

        }
        if (dem == n-1) {
            System.out.println("Khong co gia tri nao thoa man dk ");
        }
    }
}
