package com.example.khiem_1000_bai_tap.bai120;

import java.util.Scanner;

public class Bai120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        xuatSoChinhPhuong(n);
    }

    public static boolean soChinhPhuong(int m) {
        for (int i = 1; i <= m; i++) {
            if (i * i == m) {
                return true;
            }
        }
        return false;
    }

    public static void xuatSoChinhPhuong(int n) {
        System.out.println("so chinh phuong nho hon " + n + " la: ");
        for (int j = 1; j < n; j++) {
            if (soChinhPhuong(j)) {
                System.out.print(j + " ");
            }
        }
    }

}
