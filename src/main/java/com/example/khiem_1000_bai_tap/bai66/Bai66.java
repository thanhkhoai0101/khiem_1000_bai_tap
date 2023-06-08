package com.example.khiem_1000_bai_tap.bai66;

import java.util.Scanner;

public class Bai66 {
    public static void main(String[] args) {//ax^4+bx^2+c=0
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
        float delta = (b * b) - (4 * a * c);
        double t1;
        double t2;
        System.out.println("  aX^4+bx^2+c =0 ");

        if (delta < 0) {
            System.out.println(" PT vo nghiem ");
        }

        if (delta == 0) {
            t1 = t2 = -b / (2 * a);
            if (t1 == 0) {
                System.out.println("PT co 1 nghiem x = " + 0);
            }
            if (t1 < 0) {
                System.out.println(" PT vo nghiem ");
            }
            if (t1 > 0) {
                System.out.println(" PT co 2 nghiem x1 =" + Math.sqrt(t1) + " va x2 = " + -Math.sqrt(t1));
            }
        }
        if (delta > 0) {
            t1 = (-b + Math.sqrt(delta)) / (2 * a);
            t2 = (-b - Math.sqrt(delta)) / (2 * a);
            if (t1 < 0) {
                if (t2 < 0) {
                    System.out.println(" PT vo nghiem ");
                }
                if (t2 == 0) {
                    System.out.println(" PT co 1 nghiem x = " + 0);
                }
                if (t2 > 0) {
                    System.out.println(" PT co 2 nghiem x1 =" + Math.sqrt(t2) + " va x2 = " + -Math.sqrt(t2));
                }
            }
            if (t1 == 0) {
                if (t2 < 0) {
                    System.out.println(" PT co 1 nghiem x = " + 0);
                }
                if (t2 > 0) {
                    System.out.println(" PT co 3 nghiem x1 =" + 0 + " x2 = " + Math.sqrt(t2) + " va x3 = " + -Math.sqrt(t2));
                }
            }
            if (t1 > 0) {
                if (t2 < 0) {
                    System.out.println(" PT co 2 nghiem x1 =" + Math.sqrt(t1) + " va x2 = " + -Math.sqrt(t1));
                }
                if (t2 == 0) {
                    System.out.println(" PT co 3 nghiem x1 =" + Math.sqrt(t1) + " va x2 = " + -Math.sqrt(t1) + " x3 = " + 0);
                }
                if (t2 > 0) {
                    System.out.println(" PT co 4 nghiem x1 =" + Math.sqrt(t1) + " va x2 = " + -Math.sqrt(t1));
                    System.out.println(" x3 = " + Math.sqrt(t2) + " va x4 = " + -Math.sqrt(t2));
                }
            }

        }

    }
}
//dt>0;t1<0(t2<=>0)
// t1=0..t2><0
//t1>0 (t2<0.=0.>0