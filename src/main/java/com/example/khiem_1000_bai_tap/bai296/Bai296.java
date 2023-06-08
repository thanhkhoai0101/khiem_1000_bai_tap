package com.example.khiem_1000_bai_tap.bai296;

import java.util.Scanner;

public class Bai296 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuatMang(arr, n);
        lieTKe(arr, n);


    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap PT thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int timMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkMax(int[] arr, int a, int b, int n) {
        int max = timMax(arr, n);
        for (int i = a; i <= b; i++) {
            if (arr[i] == max) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTangDan(int[] arr, int a, int b) {
        for (int i = a; i < b; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void lieTKe(int[] arr, int n) {
        System.out.println("Mang con tang dan co chua GT LN la ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checkTangDan(arr, i, j) && checkMax(arr, i, j, n)) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
