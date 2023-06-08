package com.example.khiem_1000_bai_tap.bai95;

import java.util.Scanner;

public class Bai95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (c < 0) {
            c = -c;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
