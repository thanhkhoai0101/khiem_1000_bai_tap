package com.example.khiem_1000_bai_tap.bai101;

import java.util.Scanner;

public class Bai101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        int nam = scanner.nextInt();
        if (thang < 1 || thang > 12) {
            do {
                System.out.println("thang khong hop le nhap lai");
                thang = scanner.nextInt();
                nam = scanner.nextInt();
            }
            while (thang < 1 || thang > 12);
        }
        int Ngay = Ngaytrongthang(thang, nam);
        System.out.println(" Thang " + thang + " Nam " + nam + " co " + Ngay + " Ngay");

    }
    public static int Ngaytrongthang(int thang, int nam) {
        int Ngay = 0;
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            Ngay = 31;
        }
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            Ngay = 30;
        }
        if (thang == 2) {
            if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                Ngay = 29;
            } else {
                Ngay = 28;
            }
        }
        return Ngay;
    }
}
