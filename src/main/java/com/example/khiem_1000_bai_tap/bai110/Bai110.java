package com.example.khiem_1000_bai_tap.bai110;

public class Bai110 {
    public static void main(String[] args) {
        for (int i = 1; i <= 400; i++) {
            for (int j = 1; j <= 200; j++) {
                for (int k = 1; k <= 40; k++) {
                    if (i * 1000 + j * 2000 + k * 5000 == 200000) {
                        System.out.println(i + " 1k  " + j + " 2k  " + k + " 5k  ");
                    }
                }
            }
        }
    }

}
