package com.example.khiem_1000_bai_tap.bai143;

import java.util.Scanner;

public class Bai143 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 10);
        xuatMang(mang, 10);
        int sochan = chanDautiem(mang, 10);
        if (sochan == -1) {
            System.out.println("Khong co gia tri chan nao " + sochan);
        } else {
            System.out.println("So chan dau tien la " + sochan);
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }

    public static int chanDautiem(int[] mang, int n) {

        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
               return mang[i];
            }
        }
        return -1;
    }
}
