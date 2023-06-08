package com.example.khiem_1000_bai_tap.bai9;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tich = bai9(n);
        System.out.println(tich);
    }

    public static int bai9(int n) {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * i;
        }
        return tich;
    }
}
