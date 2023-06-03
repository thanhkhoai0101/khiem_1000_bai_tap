package com.example.khiem_1000_bai_tap.bai227;

import java.util.Scanner;

public class Bai227 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl phan Tu N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr,n);
        int dem = demKeNhau(arr, n);
        if (dem == 0) {
            System.out.println("KHong co GT nao thoa man" + 0);
        } else {
            System.out.println("Sl ke nhau va trai dau la " + dem);
        }

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static int demKeNhau(int[] arr, int n) {
        int dem = 0;
        if (arr[0] > 0 && arr[1] < 0 || arr[0] < 0 && arr[1] > 0) {
            dem++;
        }
        if (arr[n - 1] > 0 && arr[n - 2] < 0 || arr[n - 1] < 0 && arr[n - 2] > 0) {
            dem++;
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > 0 && arr[i - 1] < 0 || arr[i] < 0 && arr[i - 1] > 0
                    || arr[i] > 0 && arr[i + 1] < 0 || arr[i] < 0 && arr[i + 1] > 0) {
                dem++;
            }

        }
        return dem;
    }
}
