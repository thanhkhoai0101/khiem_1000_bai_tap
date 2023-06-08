package com.example.khiem_1000_bai_tap.bai44;

import java.util.Scanner;

public class Bai44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            do {
                System.out.println(" nhap so lon hon hoac bang 0 ");
                n = scanner.nextInt();
            }
            while (n < 0);
        }
        int tong = tongSodem(n);
        System.out.println("tong cac chu so cua " + n + " la " + tong);
    }

    public static int tongSodem(int n) {
        int tong = 0;
        int s = 0;
        for (int i = n; i >= 1; i = i / 10) {
            s = i % 10;
            tong += s;
        }
        return tong;
    }
}
