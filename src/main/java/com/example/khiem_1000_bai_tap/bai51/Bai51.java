package com.example.khiem_1000_bai_tap.bai51;

import java.util.Scanner;

public class Bai51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = sOln(n);
        System.out.println("so lon nhat cua " + n + " la " + max);

    }

    public static int sOln(int n) {
        int max = 0;
        int t = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t > max) {
                max = t;
            }
        }
        return max;
    }
}
