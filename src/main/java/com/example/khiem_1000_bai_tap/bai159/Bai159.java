package com.example.khiem_1000_bai_tap.bai159;

import java.util.Scanner;

public class Bai159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so long mang N");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nHapMAng(mang, n);
        if (dauTien(mang, n) == 0) {
            System.out.println("Khong co gia tri nao lon hon 2003 " + 0);
        } else {
            System.out.println("Gia tri dau tien lon hon 2003 la " + dauTien(mang, n));
        }

    }

    public static void nHapMAng(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Phan tu ");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int dauTien(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            if (mang[i] > 2003) {
                return mang[i];
            }
        }
        return 0;
    }
}
