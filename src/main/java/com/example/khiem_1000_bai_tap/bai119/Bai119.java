package com.example.khiem_1000_bai_tap.bai119;

import java.util.Scanner;

public class Bai119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        xuatSNT(n);

    }

    public static boolean soNnguyenTo(int n) {
        int dem = 0;
        if (n < 2) {
            return false;
        } else if (n > 2) {
            if (n % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i <= n; i += 2) {
                    if (n % i == 0) {
                        dem++;
                    }
                }
                if (dem == 1) {
                    return true;
                } else {
                    return false;
                }

            }

        }

        return true;
    }

    public static void xuatSNT(int n) {
        System.out.println(" cac so nguyen to nho hon " + n + " la ");
        for (int i = 1; i <= n; i++) {
            if (soNnguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
