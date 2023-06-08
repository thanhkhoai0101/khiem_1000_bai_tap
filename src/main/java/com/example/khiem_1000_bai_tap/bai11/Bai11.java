package com.example.khiem_1000_bai_tap.bai11;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = tongBai11(n);
        System.out.println(tong);
    }

    public static int tongBai11(int n) {
        int tong = 0;
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * i;
            tong = tong + tich;
        }
        return tong;
    }


}
