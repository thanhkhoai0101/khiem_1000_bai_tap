package com.example.khiem_1000_bai_tap.bai168;

import java.util.Scanner;

public class Bai168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        if (timSoMax(mang, n) == 0) {
            System.out.println("Khong co gia tri nao co dang 5^k " + 0);
        } else {
            System.out.println("So co dang 5^k LN la " + timSoMax(mang, n));
        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

    }

    public static boolean check(int n) {
        int tich = 1;
        for (int i = 1; i < n; i++) {
            tich *= 5;
            if (tich == n) {
                return true;
            }
        }
        return false;
    }

    public static int timSo(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            if (check(mang[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int timSoMax(int[] mang, int n) {
        if (timSo(mang, n) == -1) {
            return 0;
        }
        int max = mang[timSo(mang, n)];
        for (int i = timSo(mang, n) + 1; i < n; i++) {
            if (check(mang[i]) && mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

}
