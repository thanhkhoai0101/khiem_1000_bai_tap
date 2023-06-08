package com.example.khiem_1000_bai_tap.bai145;

import java.util.Scanner;

public class Bai145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[10];
        int n = scanner.nextInt();
        nhapMang(mang, n);
        int soHTdautien = soHoanthien(mang, n);
        if (soHTdautien == -1) {
            System.out.println("Khong co so hoan thien nao " + soHTdautien);
        } else {
            System.out.println("So hoan thien dau tien la " + soHTdautien);
        }
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static boolean check(int n) {
        int tong = 0;
        if (n == 0) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;

    }

    public static int soHoanthien(int[] mang, int n) {

        for (int i = 0; i < n; i++) {
            if (check(mang[i])) {
                return mang[i];
            }
        }
        return -1;
    }

}
