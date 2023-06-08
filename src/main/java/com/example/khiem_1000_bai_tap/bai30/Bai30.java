package com.example.khiem_1000_bai_tap.bai30;

import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sohoanthien = baiso30(n);
        if (sohoanthien == n) {
            System.out.println("so " + n + " la so hoan thien");

        } else {
            System.out.println(" so " + n + " khong phai la so hoan thien");
        }
    }

    public static int baiso30(int n) {
        int sohoanthien = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sohoanthien += i;
            }

        }
        return sohoanthien;
    }

}
