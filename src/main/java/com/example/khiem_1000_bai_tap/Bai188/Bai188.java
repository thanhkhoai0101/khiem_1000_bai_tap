package com.example.khiem_1000_bai_tap.Bai188;

import java.util.Scanner;

public class Bai188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapmang(mang,n);
        lietKe(mang,n);

    }

    public static void nhapmang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soChanLN(int[] mang, int n) {
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] % 2 == 0 && mang[i] > max || max % 2 != 0) {
                max = mang[i];
            }
        }
        return max;
    }

    public static void lietKe(int[] mang, int n) {
        int max = soChanLN(mang, n);
        if (max % 2 != 0) {
            System.out.println("Khong co GT chan Nao ");
        } else {
            System.out.println("Cac vi tri co gia tri chan LN la ");
            for (int i = 0; i < n; i++) {
                if (mang[i] == max) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
