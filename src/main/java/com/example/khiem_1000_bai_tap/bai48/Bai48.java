package com.example.khiem_1000_bai_tap.bai48;

import java.util.Scanner;

public class Bai48 {
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
        int tichle = demSole(n);
        System.out.println("tich so le cua "+n+" la "+tichle);
    }

    public static int demSole(int n) {
        int tichle = 1;
        int t = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t % 2 != 0) {
                tichle *= t;
            }
        }
        return tichle;
    }
}
