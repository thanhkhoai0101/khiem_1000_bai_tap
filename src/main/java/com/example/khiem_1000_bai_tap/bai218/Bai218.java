package com.example.khiem_1000_bai_tap.bai218;

import java.util.Scanner;

public class Bai218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        if (demDoiXung(arr, n) == 0) {
            System.out.println("Khong co GT nao La So doi Xung");
        } else {
            System.out.println("Co " + demDoiXung(arr, n) + " so doi Xung");
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean checkDoiXung(int n) {
        int t = 0;
        int a = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
            a = a * 10 + t;
        }
        return a == n;
    }

    public static int demDoiXung(int[] arr, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkDoiXung(arr[i])) {
                dem++;
            }
        }
        return dem;
    }

}
