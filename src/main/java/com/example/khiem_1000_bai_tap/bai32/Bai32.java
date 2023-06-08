package com.example.khiem_1000_bai_tap.bai32;

import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int scp = soChinhphuong(n);
        if (n == 0 || scp > 0) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }

    public static int soChinhphuong(int n) {
        int scp = 0;
        for (int i = 1; i <= n; i++) {
            if (i*i==n) {
                scp++;
                break;
            }
        }
        return scp;
    }
}
