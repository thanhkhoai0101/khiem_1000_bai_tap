package com.example.khiem_1000_bai_tap.bai153;

import java.util.Scanner;

public class Bai153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (soChanNN(mang, n) == -1) {
            System.out.println("Khong co gia tri chan nao " + soChanNN(mang, n));
        } else {
            System.out.println("So chan nho nhat la " + soChanNN(mang, n));
        }
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soChanNN(int[] mang, int n) {
        int min = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0 && mang[i] < min || min % 2 != 0) {
                min = mang[i];
            }
        }
        if (min % 2 == 0) {
            return min;
        }
        return -1;
    }

}
