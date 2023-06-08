package com.example.khiem_1000_bai_tap.bai64;

import java.util.Scanner;

public class Bai64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        double nghiem = -a / b;
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh aX + b co vo so nghiem ");
            } else {
                System.out.println("phuong trinh aX + b  vo nghiem ");

            }


        }
        if (b == 0) {
            System.out.println("phuong trinh aX + b co nghiem la " + 0);
        } else {
            System.out.println("phuong trinh aX + b co nghiem la " + nghiem);

        }
    }
}
