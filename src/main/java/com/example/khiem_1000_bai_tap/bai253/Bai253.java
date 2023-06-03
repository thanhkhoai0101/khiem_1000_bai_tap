package com.example.khiem_1000_bai_tap.bai253;

import java.util.Scanner;

public class Bai253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL PT A vs B");
        int na = scanner.nextInt();
        int nb = scanner.nextInt();
        int[] arr1 = new int[na];
        int[] arr2 = new int[nb];
        nhapMang(arr1, arr2, na, nb);
        xuaTManG(arr1, arr2, na, nb);
        int a = kTraATrongB(arr1, arr2, na, nb);
        if (a == 0) {
            System.out.println("Mang A co phan tu Khong Nam trong Mang B");
        } else {
            System.out.println("Tat ca PT Mang A nam trong Mang B ");
        }

    }

    public static void nhapMang(int[] arr1, int[] arr2, int na, int nb) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < na; i++) {
            System.out.println("Nhap PT Mang A " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < nb; i++) {
            System.out.println("Nhap Phan Tu Mang B " + i);
            arr2[i] = scanner.nextInt();
        }
    }

    public static void xuaTManG(int[] arr1, int[] arr2, int na, int nb) {
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

    public static int kTraATrongB(int[] arr1, int[] arr2, int na, int nb) {
        int a;
        if (na > nb) {
            return 0;
        }
        for (int i = 0; i < na; i++) {
            a = 0;
            for (int j = 0; j < nb; j++) {
                if (arr1[i] == arr2[j]) {
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                return 0;
            }
        }
        return 1;
    }
}
