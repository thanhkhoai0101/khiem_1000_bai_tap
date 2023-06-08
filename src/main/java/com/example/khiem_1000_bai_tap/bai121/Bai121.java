package com.example.khiem_1000_bai_tap.bai121;

public class Bai121 {
    public static void main(String[] args) {
        int tong = 0;
        double a = 0;
        double b;
//SO Amstrong

        for (int i = 1; i <= 1000000; i++) {
            for (int j = i; j >= 1; j /= 10) {
                a++;
            }
            for (int k = i; k >= 1; k /= 10) {
                b = k % 10;
                tong += Math.pow(b, a);
            }
            if (tong == i) {
                System.out.println(i);
            }
            tong = 0;
            a = 0;

        }

    }
}

