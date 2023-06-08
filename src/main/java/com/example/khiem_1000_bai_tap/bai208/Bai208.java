package com.example.khiem_1000_bai_tap.bai208;

import java.util.Scanner;

public class Bai208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nHap_mAng(arr, n);
        if (tong_Scp(arr, n) == 0) {
            System.out.println("Trong mang khong co So cp" + 0);
        } else {
            System.out.println("Tong cac so chinh phuong trong mang la " + tong_Scp(arr, n));
        }

    }

    public static void nHap_mAng(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean check_SCP(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static int tong_Scp(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (check_SCP(arr[i])) {
                tong += arr[i];
            }
        }
        return tong;
    }
}
