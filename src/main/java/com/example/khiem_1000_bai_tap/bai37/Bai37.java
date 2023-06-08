package com.example.khiem_1000_bai_tap.bai37;

import java.util.Scanner;

public class Bai37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(s(n));

        scanner.close();
    }

    public static double s(int n) {
        double kq = 0;
        for (double i = 2; i <= n; i++) {
            kq = Math.pow(i + kq, 1 / i);
        }
        return kq;
    }
}