package com.example.khiem_1000_bai_tap.bai55;

import java.util.Scanner;

public class Bai55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soDau = soDautien(n);
        System.out.println("so dau tien cua "+n+" la "+soDau);

    }

    public static int soDautien(int n) {
        int soDau = 0;
        for (int i = n; i >= 1; i = i / 10) {
            soDau = i % 10;
        }
        return soDau;
    }
}
