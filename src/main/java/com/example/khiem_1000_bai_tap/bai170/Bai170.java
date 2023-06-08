package com.example.khiem_1000_bai_tap.bai170;

import java.util.Scanner;

public class Bai170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        System.out.println("SNT NN > moi GT trong mang la " + soNT(mang, n));

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int max(int[] mang, int n) {
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    public static boolean checkSNT(int n) {
        if (n < 2 || n > 2 && n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int soNT(int[] mang, int n) {

        int i = max(mang, n) + 1;

        while (i>max(mang,n)) {
            if (checkSNT(i)){
                break;
            }
            i++;
        }
        return i;

    }
}
