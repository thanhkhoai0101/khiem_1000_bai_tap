package com.example.khiem_1000_bai_tap.bai186;

import java.util.Scanner;

public class Bai186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, n);
        viTriSoam(arr, n);

    }

    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int soAmdautien(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void viTriSoam(int[] arr, int n) {
        int amdau = soAmdautien(arr, n);
        int dem = 0;
        if (amdau == -1) {
            System.out.println("Khong co so am trong mang nay ");
        } else {
            System.out.println("Vi tri so am co gia tri bang so am dau tien la ");
            for (int i = amdau + 1; i < n; i++) {
                if (arr[i] == arr[amdau]) {
                    System.out.print(i + 1 + " ");
                } else {
                    dem++;
                }
            }

        }
        if (dem == n - (amdau + 1)) {
            System.out.println(" so am dau tien la " + arr[amdau] + " khong con gia tri nao  nao trung");
        }
    }
}
