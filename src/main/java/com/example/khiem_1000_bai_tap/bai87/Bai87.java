package com.example.khiem_1000_bai_tap.bai87;

public class Bai87 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 10000; i++) {
            n += i;
            if (n  > 10000) {
                System.out.println(" 1+2+... + " + i + " > 10000 " + n);
                break;
            }
        }
    }
}
