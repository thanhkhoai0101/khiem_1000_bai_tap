package com.example.khiem_1000_bai_tap.bai197;

import java.util.Scanner;

public class Bai197 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        LietKe(mang, n);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static boolean checkLe(int n) {
        int t = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
        }
        if (t % 2 == 0) {
            return false;
        }
        return true;
    }

    public static void LietKe(int[] mang, int n) {
        int a = 0;
        System.out.println("CacVi tri co so Le o dau la ");
        for (int i = 0; i < n; i++) {
            if (checkLe(mang[i])) {
                System.out.print(i + 1 + " ");
            } else {
                a++;
            }
        }
        if (a == n) {
            System.out.println(" Khong Co ");
        }
    }

}
