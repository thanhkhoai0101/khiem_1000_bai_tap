package com.example.khiem_1000_bai_tap.bai122;

import java.util.Scanner;

public class Bai122 {
    public static void main(String[] args) {
        int[] mang = new int[10];
        inPutmang(mang, 10);
        outPut(mang, 10);
        int max = maxBai122(mang, 10);
        System.out.println(" max la " + max);

    }

    public static void inPutmang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < n) {
            mang[i] = scanner.nextInt();
            i++;
        }
    }

    public static void outPut(int[] mang, int n) {
        int j = 0;
        while (j < n) {
            System.out.print(" " + mang[j]);
            j++;
        }

    }

    public static int maxBai122(int[] mang, int n) {
        int max = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }
}
