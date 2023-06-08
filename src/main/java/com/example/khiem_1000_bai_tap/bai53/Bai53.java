package com.example.khiem_1000_bai_tap.bai53;

import java.util.Scanner;

public class Bai53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dem = demMax(n);
        System.out.println("So luong chu so lon nhat cua " + n + " la " + dem);
    }

    public static int demMax(int n) {
        int dem = 0;
        int t = 0;
        int max = 0;
        for (int i = n; i >= 1; i = i / 10) {
            for (int j = n; j >= 1; j = j / 10) {
                t = j % 10;
                if (t > max) {
                    max = t;
                }
            }
            t = i % 10;
            if (t == max) {
                dem++;
            }
        }
        return dem;
    }
}
