package com.example.khiem_1000_bai_tap.bai23;

import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soluong = souocbai23(n);
        System.out.println("so luong uoc cua n la " + soluong);
    }

    public static int souocbai23(int n) {
        int soluong = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                soluong += 1;
            }
        }
        return soluong;
    }
}
