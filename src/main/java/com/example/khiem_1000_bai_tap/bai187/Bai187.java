package com.example.khiem_1000_bai_tap.bai187;

import java.util.Scanner;

public class Bai187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr,n);
        lietKe(arr,n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int Min(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > 0 && arr[i] < min || min < 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void lietKe(int[] arr, int n) {
        int min = Min(arr, n);
        if (min <= 0) {
            System.out.println("Khong co GT duong nao");
        } else {
            System.out.println("Cac Vi tri co gia tri duong nho nhat la ");
            for (int i = 0; i < n; i++) {
                if (arr[i] == min) {
                    System.out.print(i + " ");
                }

            }
        }

    }
}
