package com.example.khiem_1000_bai_tap.bai62;

import java.util.Scanner;

public class Bai62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int uMax = uCLn(a, b);
        System.out.println("uoc chung lon nhat cua " + a + " va " + b + " la "+uMax);

    }

    public static int uCLn(int a, int b) {
        int uoc = 0;
        int uMax = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                uoc = i;
            }
            if (uoc > uMax) {
                uMax = uoc;
            }

        }
        return uMax;
    }
}
