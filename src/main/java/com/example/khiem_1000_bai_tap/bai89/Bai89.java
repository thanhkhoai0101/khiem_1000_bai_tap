package com.example.khiem_1000_bai_tap.bai89;

import java.util.Scanner;

public class Bai89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            tong += i;
            System.out.print(i + " + ");
            if (tong + i >= n) {
                System.out.println("  = " + tong);
                break;
            }
        }
    }

}
