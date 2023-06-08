package com.example.khiem_1000_bai_tap.bai189;

import java.util.Scanner;

public class Bai189 {
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

    public static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
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
        System.out.println("Cac SO NGUYEN TO  co so le dau ");
        for (int i = 0; i < n; i++) {
            if (SNT(mang[i]) && checkLe(mang[i])) {
                System.out.print(mang[i] + " ");
            } else {
                a++;
            }
        }
        if (a == n) {
            System.out.println(" Khong Co ");
        }
    }
}
