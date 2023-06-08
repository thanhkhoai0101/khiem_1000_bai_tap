package com.example.khiem_1000_bai_tap.bai171;

import java.util.Scanner;

public class Bai171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        System.out.println("UCLN la " + uocChungLN(mang, n));

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soNN(int[] mang, int n) {
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }

    public static int uocChungLN(int[] mang, int n) {
        int min = soNN(mang, n);
        int dem;
        int max = 1;
        for (int i = min; i >= 2; i--) {
            dem = 0;
            for (int j = 0; j < n; j++) {
                if (mang[j] % i == 0) {
                    dem++;
                }
            }
            if (dem == n) {
                max = i;
                break;
            }
        }
        return max;
    }

}
//400996440