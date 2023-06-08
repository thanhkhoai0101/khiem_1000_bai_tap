package com.example.khiem_1000_bai_tap.bai139;

import java.util.Scanner;

public class Bai139 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 10);
        xuatMang(mang, 10);
        int soHT = soHoanThien(mang, 10);
        if (soHT == -1) {
            System.out.println(" Khong co so hoan thien" + soHT);
        } else {
            System.out.println("Vi tri So Hoan Thien Cuoi Cung la " + soHT);
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

    public static boolean checkhoanThien(int n) {

        int tong = 0;
        if (n == 0) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
       return tong==n;

    }

    public static int soHoanThien(int[] mang, int n) {
        int soHT = -1;
        for (int i = n-1; i>=0; i--) {
            if (checkhoanThien(mang[i])) {
                soHT = i+1;
                break;
            }
        }
        return soHT;

    }
}
