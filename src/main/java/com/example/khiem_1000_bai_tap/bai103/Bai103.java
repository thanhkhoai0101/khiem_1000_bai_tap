package com.example.khiem_1000_bai_tap.bai103;

import java.util.Scanner;

public class Bai103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Ngày");
        int ngay = scanner.nextInt();
        System.out.println("Nhập Tháng ");
        int thang = scanner.nextInt();
        System.out.println("Nhập Năm");
        int nam = scanner.nextInt();
        System.out.println(" Ngay " + ngay + " Thang " + thang + "  Nam  " + nam);

        int Ntt = Ngaytrongthang(thang, nam);
        if (ngay == 1) {
            ngay = Ntt;
            if (thang == 1) {
                thang = 12;
                nam--;
            } else {
                thang--;
            }
        } else {
            ngay--;
        }

        System.out.println(" Ngay truoc do la Ngay " + ngay + " Thang " + thang + "  Nam  " + nam);

    }

    public static int Ngaytrongthang(int thang, int nam) {
        int Ntt = 1;
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            Ntt = 31;
        }
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            Ntt = 30;
        }
        if (thang == 2) {
            if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                Ntt = 29;
            } else {
                Ntt = 28;
            }
        }
        return Ntt;
    }

}
