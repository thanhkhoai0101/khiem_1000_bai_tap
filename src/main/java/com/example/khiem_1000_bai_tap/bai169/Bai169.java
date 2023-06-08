package com.example.khiem_1000_bai_tap.bai169;

import java.util.Scanner;

public class Bai169 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (soLeNN(mang, n) == 0) {
            System.out.println("Khong co so le trong mang  ");
        } else {
            System.out.println(" So chan LN nho Hon Moi So Le la " + (soLeNN(mang, n) - 1));
        }
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soLeNN(int[] mang, int n) {
        int min = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0 && mang[i] < min || min % 2 == 0) {
                min = mang[i];
            }
        }
        if (min % 2 != 0) {
            return min;
        } else {
            return 0;
        }
    }

}
