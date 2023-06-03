package com.example.khiem_1000_bai_tap.bai221;

import java.util.Scanner;

public class bai221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Sl Phan Tu mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        int a = tOngQuanChanLe(arr, n);
        if (a == -1) {
            System.out.println(a + " Chan nhieu hon le ");
        } else if (a == 0) {
            System.out.println(a + " Chan va le Bang nhau ");
        } else {
            System.out.println(a + " Le nhieu hon chan ");
        }
    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static int tOngQuanChanLe(int[] arr, int n) {
        int demC = 0;
        int demL = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                demC++;
            } else {
                demL++;
            }
        }
        if (demC > demL) {
            return -1;
        }
        if (demC == demL) {
            return 0;
        }
        return 1;
    }
}
