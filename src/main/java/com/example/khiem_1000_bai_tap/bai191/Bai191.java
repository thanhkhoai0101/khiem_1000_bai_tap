package com.example.khiem_1000_bai_tap.bai191;

import java.util.Scanner;

public class Bai191 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        LietKe(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static void LietKe(int[] arr, int n) {
        int a = 0;
        System.out.println("Cac GT cuc dai La ");
        for (int i = 1; i < n - 1; i ++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            } else {
                a++;
            }
        }
        if (a == n) {
            System.out.println(" Hong Co ");
        }
    }
}
