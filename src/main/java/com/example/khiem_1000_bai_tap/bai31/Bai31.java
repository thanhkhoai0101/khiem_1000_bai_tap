package com.example.khiem_1000_bai_tap.bai31;

import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = sNt(n);
        if (s >= 1 || n == 1) {
            System.out.println(n + " khong phai la so nguyen to  ");
        } else {
            System.out.println(n + " la so nguyen to  ");
        }
    }

    public static int sNt(int n) {
        int s = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                s += 1;
            }

        }
        return s;
    }
}
