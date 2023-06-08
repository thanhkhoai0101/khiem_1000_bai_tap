package com.example.khiem_1000_bai_tap.bai158;

import java.util.Scanner;

public class Bai158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mang[] = new int[n];
        nhapMang(mang, n);
        int x = timX(mang, n);
        System.out.println("Doan [-x,x] Chua duoc tat ca gia tri la " + -x + " va " + x);
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int timX(int[] mang, int n) {
        int max = Math.abs(mang[0]);
        for (int i = 1; i < n; i++) {
            if (Math.abs(mang[i]) > max) {
                max = Math.abs(mang[i]);
            }
        }
        return max;
    }
}
