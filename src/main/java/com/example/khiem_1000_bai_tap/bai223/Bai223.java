package com.example.khiem_1000_bai_tap.bai223;

import java.util.Scanner;

public class Bai223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL Phan tu Mang N");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        xuaTmaNg(arr, n);
        if (demNguyenTo(arr, n) == 0) {
            System.out.println("Khong co so Nguyen To Nao " + 0);
        } else {
            System.out.println("So luong SNT trong mang la " + demNguyenTo(arr, n));
        }
    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Gia Tri Phan tu " + i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuaTmaNg(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int demNguyenTo(int[] arr, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkSNT(arr[i])) {
                dem++;
            }
        }
        return dem;
    }
}
