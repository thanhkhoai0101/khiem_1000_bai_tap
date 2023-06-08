package com.example.khiem_1000_bai_tap.bai183;

import java.util.Scanner;

public class Bai183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        viTriLN(mang, n);


    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int max(int[] mang, int n) {
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    public static void viTriLN(int[] mang, int n) {
        int max = max(mang, n);
        System.out.println("cac Vi tri co gia tri LN la ");
        for (int i = 0; i < n; i++) {
            if (mang[i] == max) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
