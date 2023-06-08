package com.example.khiem_1000_bai_tap.bai26;

import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long tichle = bAi26(n);
        System.out.println("tich uoc so le cua n = " + tichle);
    }

    public static long bAi26(int n) {
        long tichle = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                tichle *= i;
            }
        }
        return tichle;
    }
}
