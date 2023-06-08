package com.example.khiem_1000_bai_tap.bai54;

import java.util.Scanner;

public class Bai54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dem = demMin(n);
        System.out.println("So luong chu so nho nhat cua " + n + " la " + dem);
    }

    public static int demMin(int n) {
        int dem = 0;
        int t = 0;
        int min = 9;
        for (int i = n; i >= 1; i = i / 10) {
            for (int j = n; j >= 1; j = j / 10) {
                t = j % 10;
                if (t < min) {
                    min = t;
                }
            }
            t = i % 10;
            if (t == min) {
                dem++;
            }
        }
        return dem;
    }
}
