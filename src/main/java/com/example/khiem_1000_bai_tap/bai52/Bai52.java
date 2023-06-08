package com.example.khiem_1000_bai_tap.bai52;

import java.util.Scanner;

public class Bai52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = sOnho(n);
        System.out.println("so nho nhat cua " + n + " la " + min);

    }

    public static int sOnho(int n) {
        int min = 9;
        int t = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t < min) {
                min = t;
            }
        }
        return min;
    }
}