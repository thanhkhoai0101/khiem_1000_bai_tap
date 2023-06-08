package com.example.khiem_1000_bai_tap.bai193;

import java.util.Scanner;

public class Bai193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        lietKe(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean check3k(int n) {
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = tich * 3;
            if (tich == n) {
                return true;
            }
        }
        return false;
    }

    public static void lietKe(int[] arr, int n) {
        int a = 0;
        System.out.println("Gt co dang 3^k la ");
        for (int i = 0; i < n; i++) {
            if (check3k(arr[i])) {
                System.out.print(arr[i] + " ");
            } else {
                a++;
            }
        }
        if (a == n) {
            System.out.println("Khong co " + 0);
        }
    }
}
