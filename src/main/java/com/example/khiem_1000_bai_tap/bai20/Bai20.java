package com.example.khiem_1000_bai_tap.bai20;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Uoc cua so " + n + " la ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}

