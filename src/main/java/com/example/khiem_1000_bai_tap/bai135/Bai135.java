package com.example.khiem_1000_bai_tap.bai135;

import java.util.Scanner;

public class Bai135 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 10);
        xuatMang(mang, 10);
        int giaTriduong = gtDuongDautien(mang, 10);
        if (giaTriduong == -1) {
            System.out.println("khong co GT duong " + giaTriduong);
        } else {
            System.out.println("GT duong dau tien la " + giaTriduong);

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

    public static int gtDuongDautien(int[] mang, int n) {
        int giaTriduong = -1;
        for (int i = 0; i < n; i++) {
            if (mang[i] > 0) {
                giaTriduong = mang[i];
                break;
            }
        }
        return giaTriduong;
    }

}
