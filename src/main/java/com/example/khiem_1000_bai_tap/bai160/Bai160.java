package com.example.khiem_1000_bai_tap.bai160;

import java.time.Year;
import java.util.Scanner;

public class Bai160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] mang = new float[n];
        nhapMang(mang, n);
        if (soAm(mang, n) == 0) {
            System.out.println("Khong co gt nao thoa man " + 0);
        } else {
            System.out.println("gia tri am lon hon -1 la " + soAm(mang, n));
        }
    }

    public static void nhapMang(float[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextFloat();
        }
    }

    public static float soAm(float[] mang, int n) {
        for (int i = n - 1; i >= 0; i++) {
            if (mang[i] > -1 && mang[i] < 0) {
                return mang[i];
            }
        }
        return 0;
    }


}
