package com.example.khiem_1000_bai_tap.bai111;

import java.util.Scanner;

public class Bai111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        canDac(h);
        System.out.println();
        canRong(h);
        System.out.println();
        vuongDac(h);
        System.out.println();
        vuongRong(h);


    }

    public static void canDac(int h) {
        //a

        for (int i = 1; i <= h; i++) {
            for (int j = h; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void canRong(int h) {
        //b

        for (int i = 1; i <= h; i++) {
            for (int j = h; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1 || i == h) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    public static void vuongDac(int h) {
        //c
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void vuongRong(int h) {
        //d
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == h) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
