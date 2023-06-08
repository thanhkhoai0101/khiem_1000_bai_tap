package com.example.khiem_1000_bai_tap.bai190;

import java.util.Scanner;

public class Bai190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr,n);
        toanSole(arr,n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean checKsole(int n) {
        int T = 0;
        for (int i = n; i >= 1; i /= 10) {
            T = i % 10;
            if (T % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void toanSole(int[] arr, int n) {
        int a = 0;
        System.out.println("Cac vi tri co chu so toan so le la ");
        for (int i = 0; i < n; i++) {
            if (checKsole(arr[i])) {
                System.out.print(i + 1 + " ");
            } else {
                a++;
            }
        }
        if (a == n) {
            System.out.println("Khong co ");
        }
    }
}
