package com.example.khiem_1000_bai_tap.bai292;

import java.util.Scanner;

public class Bai292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap SL mang N");
        int n = scanner.nextInt();
        float[] arr = new float[n];
        nhapMang(arr, n);
        xuaTMang(arr, n);
        int[] arr1 = new int[n];
        nguyenHoa(arr, arr1, n);

    }

    public static void nhapMang(float[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Phan tu thu " + i);
            arr[i] = scanner.nextFloat();
        }
    }

    public static void xuaTMang(float[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void nguyenHoa(float[] arr, int[] arr1, int n) {

        for (int i = 0; i < n; i++) {
            arr1[i] = (int) Math.floor(arr[i]);
            if (arr[i] - arr1[i] >= 0.5) {
                arr1[i] += 1;
            }
        }
        System.out.println("Mang sau khi lam tron ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

}
