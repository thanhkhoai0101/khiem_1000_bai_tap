package com.example.khiem_1000_bai_tap.bai41;

import java.util.Scanner;

public class Bai41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float tong = tongBai41(n);
        System.out.println(tong);
    }
    public static float tongBai41(int n) {
        float tong = 1;
        for (float i = 1; i <= n; i++) {
            tong = 1 + (1 / tong);
        }
        return 1 / tong;
    }
}
