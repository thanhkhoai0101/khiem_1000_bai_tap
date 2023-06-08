package com.example.khiem_1000_bai_tap.bai216;

import java.util.Scanner;

public class Bai216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        if (demSoChan(arr, n) == 0) {
            System.out.println("Khong co so chan nao ");
        } else {
            System.out.println("Co " + demSoChan(arr, n) + " So chan trong mang");
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int demSoChan(int[] arr, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                dem++;
            }
        }
        return dem;
    }
}
