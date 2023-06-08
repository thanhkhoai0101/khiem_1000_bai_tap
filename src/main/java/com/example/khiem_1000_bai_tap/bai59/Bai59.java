package com.example.khiem_1000_bai_tap.bai59;

import java.util.Scanner;

public class Bai59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean dx = soDoixung(n);
        if (soDoixung(n)) {
            System.out.println(n + " la so dao nguoc ");
        } else {
            System.out.println(n + " khong phai la so dao nguoc ");
        }
    }
    public static boolean soDoixung(int n) {
        int t = 0;
        int daonguoc = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            daonguoc = daonguoc * 10 + t;
        }
        if (daonguoc != n||daonguoc<10) {
            return false;
        } else {
            return true;
        }
    }

}
