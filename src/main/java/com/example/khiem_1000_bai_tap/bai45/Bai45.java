package com.example.khiem_1000_bai_tap.bai45;

import java.util.Scanner;

public class Bai45 {
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
        int tich = tichSodem(n);
        System.out.println("tich cac chu so cua " + n + " la " + tich);
    }

    public static int tichSodem(int n) {
        int tich = 1;
        int t = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            tich *= t;
        }
        return tich;
    }
}

