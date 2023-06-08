package com.example.khiem_1000_bai_tap.bai49;

import java.util.Scanner;

public class Bai49 {
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
        int dem = demSodau(n);
        System.out.println("so dau tien cua "+n+" la "+dem);
    }

    public static int demSodau(int n) {
        int dem = 0;
        if (n == 0) {
            dem = 0;
        }
        for (int i = n; i >= 1; i = i / 10) {
            dem=i;
        }
        return dem;

    }

}
