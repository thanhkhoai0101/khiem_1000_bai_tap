package com.example.khiem_1000_bai_tap.bai162;

import java.util.Scanner;

public class Bai162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (timTich(mang, n) == -1) {
            System.out.println("Khong co Gia tri Thoa man dk " + -1);

        } else {
            System.out.println("Vi tri thoa man dieu kien la " + timTich(mang, n));
        }


    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int timTich(int[] mang, int n) {
        for (int i = 1; i < n - 1; i++) {
            if (mang[i] == (mang[i - 1] * mang[i + 1])) {
                return i + 1;
            }
        }
        return -1;
    }
}
