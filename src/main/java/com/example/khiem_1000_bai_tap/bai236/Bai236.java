package com.example.khiem_1000_bai_tap.bai236;

import java.util.Scanner;

public class Bai236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang a ");
        int na = scanner.nextInt();
        System.out.println("Nhap so luong mang b");
        int nb = scanner.nextInt();
        int[] arr1 = new int[na];
        int[] arr2 = new int[nb];
        nhapMang(arr1, arr2, na, nb);
        xuatMang(arr1, arr2, na, nb);
        tanSoA(arr1, arr2, na, nb);
    }

    public static void nhapMang(int[] arr1, int[] arr2, int na, int nb) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < na; i++) {
            System.out.println("Nhap phan tu mang a " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < nb; i++) {
            System.out.println("nhap phan tu mang b " + i);
            arr2[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr1, int[] arr2, int na, int nb) {
        System.out.println("Mang A :");
        for (int i = 0; i < na; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Mang B :");
        for (int i = 0; i < nb; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void tanSoA(int[] arr1, int[] arr2, int na, int nb) {
        int dem;
        System.out.println("Tan so xuat hien GT Mang A trong Mang B la :");
        for (int i = 0; i < na; i++) {
            dem = 0;
            for (int j = 0; j < nb; j++) {
                if (arr1[i] == arr2[j]) {
                    dem++;
                }
            }
            System.out.println(arr1[i] + " Xuat hien " + dem + " lan ");
        }
    }
}
