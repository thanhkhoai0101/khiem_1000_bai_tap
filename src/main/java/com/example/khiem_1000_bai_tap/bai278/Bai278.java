package com.example.khiem_1000_bai_tap.bai278;

import java.util.Scanner;

public class Bai278 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhaPManG(arr, n);
        xuaTManG(arr, n);
        xoaTrung(arr, n);


    }

    public static void nhaPManG(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTManG(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkTrung(int[] arr, int viTri) {
        for (int i = viTri - 1; i >= 0; i--) {
            if (arr[i] == arr[viTri]) {
                return true;
            }
        }
        return false;
    }

    public static void xoaTrung(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (checkTrung(arr, i)) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        System.out.println("Mang sau khi xoa Cac GT trung nhau chi giu lai 1 GT ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
