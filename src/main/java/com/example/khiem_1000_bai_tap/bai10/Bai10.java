package com.example.khiem_1000_bai_tap.bai10;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        long tich = somu2(n, x);
        System.out.println(x + " ^ " + n + " = " + tich);
    }

    public static long somu2(int n, int x) {
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * x;
        }
        return tich;
    }

}
