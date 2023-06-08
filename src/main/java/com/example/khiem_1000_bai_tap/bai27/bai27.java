package com.example.khiem_1000_bai_tap.bai27;

import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soluongchan = baiso27(n);
        System.out.println("so luong uoc chan cua n la " + soluongchan);
    }

    public static int baiso27(int n) {
        int soluongchan = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                soluongchan += 1;
            }
        }
        return soluongchan;
    }
}
