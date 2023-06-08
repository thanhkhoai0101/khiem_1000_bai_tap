package com.example.khiem_1000_bai_tap.bai192;

import java.util.Scanner;

public class Bai192 {
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

    public static boolean checkChan(int n) {
        int t = 0;
        for (int i = n; i >= 1; i /= 10) {
            t = i % 10;
        }
        if (t % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void lietKe(int[] arr, int n) {
        int a = 0;
        System.out.println("Cac GT chan Dau la ");
        for (int i = 0; i < n; i++) {
            if (checkChan(arr[i])) {
                System.out.print(arr[i] + " ");
            } else {
                a++;
            }
        }
        if (a == n) {
            System.out.println("Khong co ");
        }
    }
}
