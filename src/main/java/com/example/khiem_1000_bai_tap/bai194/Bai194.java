package com.example.khiem_1000_bai_tap.bai194;

import java.util.Scanner;

public class Bai194 {
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

    public static boolean check(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static int A(int[] arr, int n) {
        int min = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (Math.abs(arr[i] - arr[j]) < min) {
                        min = Math.abs(arr[i] - arr[j]);
                    }
                }
            }

        }
        return min;
    }

    public static void lietKe(int[] arr, int n) {

        System.out.println("Cac cap so gan nhau nhat la  ");
        int min = A(arr, n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (Math.abs(arr[i] - arr[j]) == min) {
                    System.out.println(arr[i] + "," + arr[j] + " ");
                }

            }
        }

    }
}
