package com.example.khiem_1000_bai_tap.bai43;

import java.util.Scanner;

public class Bai43 {
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
        int dem = demSo(n);
        System.out.println(n + " co " + dem + " chu so");
    }

    public static int demSo(int n) {
        int dem = 0;
        if (n == 0) {
            dem = 1;
        }
        for (int i = n; i >= 1; i = i / 10) {
            dem++;
        }
        return dem;

    }

}
