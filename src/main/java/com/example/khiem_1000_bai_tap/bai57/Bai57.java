package com.example.khiem_1000_bai_tap.bai57;

import java.util.Scanner;

public class Bai57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean sochan = pHantuchan(n);
        if (sochan == true) {
            System.out.println(n + " toan la so chan");
        } else {
            System.out.println(n + " khong phai toan so chan");
        }
    }

    public static boolean pHantuchan(int n) {
        int t;
        boolean sochan = true;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t % 2 != 0) {
                return false;
            }
        }
        return sochan;
    }
}
