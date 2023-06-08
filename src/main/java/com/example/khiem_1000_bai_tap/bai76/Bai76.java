package com.example.khiem_1000_bai_tap.bai76;

import java.util.Scanner;

public class Bai76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long tich = 1;
        for (long i = 1; i <= n; i++) {
            tich = tich * 3;
            if (tich == n) {
                System.out.println(n + " co dang 3^" + i);
                break;
            }

        }
        if (tich != n) {
            System.out.println(n + " khong phai dang 3^k");
        }
    }

}
