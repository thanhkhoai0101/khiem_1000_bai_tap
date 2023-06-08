package com.example.khiem_1000_bai_tap.bai56;

import java.util.Scanner;

public class Bai56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean sole = pHantule(n);
        if (sole == true) {
            System.out.println(n + " toan la so le");
        } else {
            System.out.println(n + " khong phai toan so le");
        }
    }

    public static boolean pHantule(int n) {
        int t = 0;
        boolean sole = true;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t % 2 == 0) {
                return false;
            }
        }
        return sole;
    }
}
