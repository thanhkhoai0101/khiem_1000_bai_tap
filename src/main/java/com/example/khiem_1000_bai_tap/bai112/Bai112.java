package com.example.khiem_1000_bai_tap.bai112;

import java.util.Scanner;

public class Bai112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai M ");
        int m = scanner.nextInt();
        System.out.println("Nhap chieu rong N ");
        int n = scanner.nextInt();

        cNdac(m, n);
        System.out.println();
        cNrong(m, n);


    }

    public static void cNdac(int m, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void cNrong(int m, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
