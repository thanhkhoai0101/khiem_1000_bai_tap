package com.example.khiem_1000_bai_tap.bai198;

import java.util.Scanner;

public class Bai198 {
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

    public static int Max(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void lietKe(int[] arr, int n) {
        int max = Max(arr, n);
        System.out.println("Cac vi tri co GT LN la  ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
