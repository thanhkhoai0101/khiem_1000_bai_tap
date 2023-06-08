package com.example.khiem_1000_bai_tap.bai196;

import java.util.Scanner;

public class Bai196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr,n);
        lietKe(arr,n);

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
    }

    public static void lietKe(float[] arr, int n) {
        int a = 0;
        System.out.println("Cac so am trong mang la ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
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
