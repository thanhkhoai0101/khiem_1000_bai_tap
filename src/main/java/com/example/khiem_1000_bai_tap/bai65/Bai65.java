package com.example.khiem_1000_bai_tap.bai65;

import java.util.Scanner;

public class Bai65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a #0");
        float a = scanner.nextFloat();
        if (a == 0) {
            do {
                System.out.println("nhap lai a#0");
                a = scanner.nextFloat();
            }
            while (a == 0);
        }
        System.out.println("nhap b");
        float b = scanner.nextFloat();
        System.out.println("nhap c");
        float c = scanner.nextFloat();

        double x1;
        double x2;
        System.out.println(" PT aX^2+bx+c =0 ");
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println(" PT vo nghiem ");
        }
        if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println(" PT co nghiem kep x1 = x2 = " + x1);
        }
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(" PT co 2 nghiem phan biet X1=" + x1 + " va X2=" + x2);
        }
    }
}


//delta=b^2-4ac;  dt<0=vn;dt=0==kep -b/2a;dt>0==2nghiem.    x1==-b+can dt /2a   x2=-b-can dt /2a