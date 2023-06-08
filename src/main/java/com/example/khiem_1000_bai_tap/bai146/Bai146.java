package com.example.khiem_1000_bai_tap.bai146;

import java.util.Scanner;

public class Bai146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[10];
        int n = scanner.nextInt();
        nhapMang(mang, n);
        int amDautien = soAm(mang, n);
        if (amDautien == 1) {
            System.out.println("khong co gia tri am nao " + amDautien);
        } else {
            System.out.println("So am dau tien la " + amDautien);
        }
    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static int soAm(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            if (mang[i] < 0) {
                return mang[i];
            }
        }
        return 1;
    }
}
