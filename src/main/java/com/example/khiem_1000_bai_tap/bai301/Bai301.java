package com.example.khiem_1000_bai_tap.bai301;

import java.util.Scanner;

public class Bai301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang A va SL Mang B ");
        int na = scanner.nextInt();
        int nb = scanner.nextInt();
        int[] arr1 = new int[na];
        int[] arr2 = new int[nb];
        nhapMang(arr1, arr2, na, nb);
        xuatMang(arr1, arr2, na, nb);
        if (kIemTraCon(arr1, arr2, na, nb)) {
            System.out.println("Mang A La Mang con cua mang B ");
        } else {
            System.out.println("mang A khong Phai La Mang con cua MAng B");
        }

    }

    public static void nhapMang(int[] arr1, int[] arr2, int na, int nb) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Phan tu mang A ");
        for (int i = 0; i < na; i++) {
            System.out.println("Thu " + i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhap Phan tu mang B ");
        for (int i = 0; i < nb; i++) {
            System.out.println("Thu " + i);
            arr2[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr1, int[] arr2, int na, int nb) {
        System.out.print("Mang A = ");
        for (int i = 0; i < na; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Mang B = ");
        for (int i = 0; i < nb; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static boolean kIemTraCon(int[] arr1, int[] arr2, int na, int nb) {
        if (na > nb) {
            return false;
        }
        int t = -1;
        int c = 0;
        for (int i = 0; i < nb; i++) {
            if (arr2[i] == arr1[0]) {
                t = i;
                c = 1;
            }
            if (c == 1) {
                for (int j = 0; j < na; j++) {
                    if (arr1[j] != arr2[t + j]) {
                        c = 0;
                        break;
                    }
                }
            }
            if (c == 1) {
                return true;
            }
        }
        return false;
    }
}
