package com.example.khiem_1000_bai_tap.bai22;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long tich = tichBai22(n);
        System.out.println("tich uoc cua n = " + tich);
    }

    public static long tichBai22(int n) {
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tich = tich * i;
            }
        }
        return tich;
    }
}
