package com.example.khiem_1000_bai_tap.bai184;



import java.util.Scanner;

public class Bai184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        lietKeSNT(mang, n);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void lietKeSNT(int[] mang, int n) {
        int dem = 0;
        System.out.println("Cac Vi tri co so nguyen to ");
        for (int i = 0; i < n; i++) {
            if (checkSNT(mang[i])) {
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
