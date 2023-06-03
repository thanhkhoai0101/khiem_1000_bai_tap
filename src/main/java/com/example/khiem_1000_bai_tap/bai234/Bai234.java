package com.example.khiem_1000_bai_tap.bai234;

import java.util.Scanner;

public class Bai234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang a ");
        int na = scanner.nextInt();
        System.out.println("Nhap so luong mang b");
        int nb = scanner.nextInt();
        int[] arr1 = new int[na];
        int[] arr2 = new int[nb];
        nhapMang(arr1, arr2, na, nb);
        xuatMang(arr1, arr2, na, nb);
        int demA = xuatHienarrA(arr1, arr2, na, nb);
        int demB = xuatHienarrB(arr1, arr2, na, nb);
        System.out.println("So luong GT chi xuat hien o a hoac b la " + (demA + demB));
        System.out.println("Co " + demA + " GT chi xuta hien o mang A ");
        System.out.println("Va co " + demB + " Gt chi xuat hien o mang B ");


    }


    public static void nhapMang(int[] arr1, int[] arr2, int na, int nb) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < na; i++) {
            System.out.println("Nhap phan tu mang a " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < nb; i++) {
            System.out.println("nhap phan tu mang b " + i);
            arr2[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr1, int[] arr2, int na, int nb) {
        System.out.println("Mang A :");
        for (int i = 0; i < na; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Mang B :");
        for (int i = 0; i < nb; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static int xuatHienarrA(int[] arr1, int[] arr2, int na, int nb) {
        int dem = 0;
        boolean check;
        for (int i = 0; i < na; i++) {
            check = true;
            for (int j = 0; j < nb; j++) {
                if (arr1[i] == arr2[j]) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                dem++;
            }

        }
        return dem;
    }

    public static int xuatHienarrB(int[] arr1, int[] arr2, int na, int nb) {
        int dem = 0;
        boolean check;
        for (int i = 0; i < nb; i++) {
            check = true;
            for (int j = 0; j < na; j++) {
                if (arr2[i] == arr1[j]) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                dem++;
            }
        }
        return dem;
    }

}



