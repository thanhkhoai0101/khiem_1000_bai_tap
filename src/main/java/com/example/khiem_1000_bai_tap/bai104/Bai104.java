package com.example.khiem_1000_bai_tap.bai104;

import java.util.Scanner;

public class Bai104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Ngày");
        int ngay = scanner.nextInt();
        System.out.println("Nhập Tháng ");
        int thang = scanner.nextInt();
        System.out.println("Nhập Năm");
        int nam = scanner.nextInt();
        System.out.println(" Ngay " + ngay + " Thang " + thang + "  Nam  " + nam);
        int soNgay = sNTn(ngay, thang, nam);
        System.out.println(" La ngay thu " + soNgay + " TRong nam");
    }

    public static int sNTn(int ngay, int thang, int nam) {
        int soNgay = ngay;
        for (int i = 1; i < thang; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                soNgay += 30;
            } else if (i == 2) {
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                    soNgay += 29;
                } else {
                    soNgay += 28;
                }
            } else {
                soNgay += 31;
            }
        }
        return soNgay;
    }

}
