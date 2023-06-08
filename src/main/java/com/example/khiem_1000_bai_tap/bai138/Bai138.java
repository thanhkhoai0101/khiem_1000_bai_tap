package com.example.khiem_1000_bai_tap.bai138;

import java.util.Scanner;

public class Bai138 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 10);
        xuatMang(mang, 10);
        int giatriChan = gtChandau(mang, 10);
        if (giatriChan == -1) {
            System.out.println("khong co GT Chan " + giatriChan);
        } else {
            System.out.println(" Vi tri GT Chan dau tien la " + giatriChan);

        }

    }

    public static void nhapMang(int[] mang, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }

    public static int gtChandau(int[] mang, int n) {
        int giatriChan = -1;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                giatriChan = i+1;
                break;
            }
        }
        return giatriChan;
    }

}

