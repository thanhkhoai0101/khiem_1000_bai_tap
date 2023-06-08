package com.example.khiem_1000_bai_tap.bai156;

import java.util.Scanner;

public class Bai156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong mang N ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        System.out.println("Nhap x ");
        int x = scanner.nextInt();
        System.out.println("Gia tri gan X nhat la " + ganNhat(mang, n, x));

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Phan Tu ");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int ganNhat(int[] arr, int n, int x) {
        int index = 0;
        int min = Math.abs(arr[0] - x);
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i] - x) < min) {
                index = i;
                min = Math.abs(arr[i] - x);
            }
        }
        return arr[index];
    }


}
