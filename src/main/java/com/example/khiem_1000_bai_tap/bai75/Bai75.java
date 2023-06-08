package com.example.khiem_1000_bai_tap.bai75;

import java.util.Scanner;

public class Bai75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long tich = 1;
        for (long i = 1; i <= n ; i++) {
            tich = tich * 2;
            if (tich == n) {
                System.out.println(n + " co dang 2^" + i);
                break;
            }

        }
        if (tich != n) {
            System.out.println(n + " khong phai dang 2^k");
        }
    }

}
