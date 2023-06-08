package com.example.khiem_1000_bai_tap.bai177;

import java.util.Scanner;

public class Bai177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap N ");
        int n = scanner.nextInt();
        float[] mang = new float[n];
        nhapMang(mang, n);
        System.out.println(" Nhap X,Y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        lietKe(mang, n, x, y);


    }

    public static void nhapMang(float[] mang, int n) {
        System.out.println("Nhap Phan tu ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextFloat();
        }
    }

    public static void lietKe(float[] mang, int n, int x, int y) {
        System.out.println("Cac GT thuoc x,y la ");
        for (int i = 0; i < n; i++) {
            if (mang[i] >= x && mang[i] <= y) {
                System.out.print(mang[i] + " ");
            }
        }
    }

}
