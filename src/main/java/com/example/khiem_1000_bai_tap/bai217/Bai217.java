package com.example.khiem_1000_bai_tap.bai217;

import java.util.Scanner;

public class Bai217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        if (demChiahet7(arr, n) == 0) {
            System.out.println("Khong co GT duong nao chia het cho 7 ");
        } else {
            System.out.println("Co " + demChiahet7(arr, n) + " So duong chia het cho 7 ");
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int demChiahet7(int[] arr, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 7 == 0 && arr[i] > 0) {
                dem++;
            }
        }
        return dem;
    }
}
