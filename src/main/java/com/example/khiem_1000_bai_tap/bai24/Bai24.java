package com.example.khiem_1000_bai_tap.bai24;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Uoc cua so le " + n + " la ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }


        }
    }

}
