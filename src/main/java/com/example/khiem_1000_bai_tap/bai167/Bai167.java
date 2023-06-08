package com.example.khiem_1000_bai_tap.bai167;

import java.util.Scanner;

public class Bai167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (soLeMax(mang, n) == 0) {
            System.out.println("Khong co GT nao thoa man DK " + 0);
        } else {
            System.out.println("Gia tri Toan So le LN la " + soLeMax(mang, n));
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static boolean checkSole(int n) {
        int timso;
        if (n % 2 == 0) {
            return false;
        }
        for (int i = n; i >= 1; i /= 10) {
            timso = i % 10;
            if (timso % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static int soLedau(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            if (checkSole(mang[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int soLeMax(int[] mang, int n) {
        if (soLedau(mang, n) == -1) {
            return 0;
        }
        int max = mang[soLedau(mang, n)];
        for (int i = soLedau(mang, n) + 1; i < n; i++) {
            if (checkSole(mang[i]) && mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }
}
