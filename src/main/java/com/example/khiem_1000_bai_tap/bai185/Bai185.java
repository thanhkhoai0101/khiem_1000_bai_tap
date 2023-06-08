package com.example.khiem_1000_bai_tap.bai185;

import java.util.Scanner;

public class Bai185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        lietKescp(mang, n);


    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static boolean checkSOchinhP(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void lietKescp(int[] mang, int n) {
        System.out.println("Cac vi tri co so chinh phuong la ");
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkSOchinhP(mang[i])) {
                System.out.print(i + 1 + " ");
            } else {
                dem++;
            }
        }
        if (dem == n) {
            System.out.println("Khong co vi tri nao ");
        }
    }
}
