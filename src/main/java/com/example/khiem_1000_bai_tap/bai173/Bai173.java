package com.example.khiem_1000_bai_tap.bai173;

import java.util.Scanner;

public class Bai173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mang = new int[n];
        nhapMang(mang, n);
        int[] arr = new int[10];
        tachMang(mang, n, arr);
        soXuathienItnhat(arr);

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void tachMang(int[] mang, int n, int[] arr) {
        int a;
        int t;
        for (int i = 0; i < n; i++) {
            a = Math.abs(mang[i]);
            if (a == 0) {
                arr[0]++;
            } else {
                while (a != 0) {
                    t = a % 10;
                    a /= 10;
                    arr[t]++;
                }
            }

        }
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] != 0 && arr[i] < min || min == 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void soXuathienItnhat(int[] arr) {
        int min = Min(arr);
        System.out.println("Chu So xuat hien It nhat la ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] == min) {
                System.out.print(i + " ");
            }
        }
    }

}
//////////////////////////////////////////////////////////////////////