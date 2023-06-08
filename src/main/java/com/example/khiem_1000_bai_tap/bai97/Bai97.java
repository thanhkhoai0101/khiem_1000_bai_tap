package com.example.khiem_1000_bai_tap.bai97;

import java.util.Scanner;

public class Bai97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a)
            do {
                System.out.println(" day khong phai la mot tam giac.nhap lai");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
            }
            while (a + b < c || a + c < b || b + c < a);


        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println(" la tam giac vuong ");
        } else if (a == b && b == c) {
            System.out.println(" la tam giac deu");
        } else if (a == b || a == c || b == c) {
            System.out.println(" la tam giac can");
        } else {
            System.out.println(" la tam giac thuong");
        }
    }
}
