package com.example.khiem_1000_bai_tap.bai96;

import java.util.Scanner;

public class Bai96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int tong = tongBai96(x);
        System.out.println(tong);
    }

    public static int tongBai96(int x) {
        int tong = 0;
        if (x >= 5) {
            tong = (2 * x * x) + (5 * x) + 9;
        }
        if (x < 5) {
            tong = (-2 * x * x) + (4 * x) - 9;
        }
        return tong;

    }
}
