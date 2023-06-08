package com.example.khiem_1000_bai_tap.bai50;

import java.util.Scanner;

public class Bai50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soDao = sOdaonguoc(n);

        if (n < 0) {
            do {
                System.out.println(" nhap so lon hon hoac bang 0 ");
                n = scanner.nextInt();
            }
            while (n < 0);
        }
        System.out.print("so dao nguoc cua " + n + " la " + soDao);
    }

    public static int sOdaonguoc(int n) {
        int soDao = 0;
        int t = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            soDao = soDao * 10 + t;
        }
        return soDao;
    }
}
