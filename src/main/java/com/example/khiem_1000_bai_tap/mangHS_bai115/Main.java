package com.example.khiem_1000_bai_tap.mangHS_bai115;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HocSinh[] hocSinhN = new HocSinh[4];
        nhapHoTen(hocSinhN, 3);
        xUatDIem(hocSinhN, 3);
    }

    public static void nhapHoTen(HocSinh[] hocSinh, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hoc sinh thu " + i);
            hocSinh[i] = new HocSinh();
            System.out.println("Ho va ten ");
            hocSinh[i].setHoTen(scanner.nextLine());
            System.out.println("Nhap diem toan ");
            hocSinh[i].setDiemToan(scanner.nextFloat());
            System.out.println("Nhap diem van ");
            hocSinh[i].setDiemVan(scanner.nextFloat());
            if (scanner.hasNextLine()) scanner.nextLine();

        }
        System.out.println("Nhap Xong");

    }

    public static void xUatDIem(HocSinh[] hocSinh, int n) {
        System.out.printf("Ho va Ten\t\t\t\tDiem toan\t\tDiem Van\t\tDiem Trung Binh%n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s\t\t%f\t\t%f\t\t%f%n",
                    hocSinh[i].getHoTen(), hocSinh[i].getDiemToan(), hocSinh[i].getDiemVan(), hocSinh[i].diemTb());
        }
    }

//    phan thanh khiem
//    6.5
//    6
//    phan thanh khoai
//    6
//    6.5
//    phan thi thuy tram
//    6
//    6.5
}
