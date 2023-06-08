package com.example.khiem_1000_bai_tap.bai99;

import java.util.Scanner;

public class Bai99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = 0;

        if (a > b) {
            min = b;
            b = a;
            a = min;
        }
        if (a > c) {
            min = c;
            c = a;
            a = min;
        }
        if (b > c) {
            min = c;
            c = b;
            b = min;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
