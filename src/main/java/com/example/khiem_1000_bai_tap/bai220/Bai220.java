package com.example.khiem_1000_bai_tap.bai220;

import java.util.Scanner;

public class Bai220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        if (demTanCung5(arr, n) == 0) {
            System.out.println("Khong co GT nao co chu so tan cung la 5 " + 0);
        } else {
            System.out.println("Co " + demTanCung5(arr, n) + " So co chu so tan cung bang 5 ");
        }


    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static int demTanCung5(int[] arr, int n) {
        int a = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            a = arr[i] % 10;
            if (a == 5) {
                dem++;
            }
        }
        return dem;
    }
}
