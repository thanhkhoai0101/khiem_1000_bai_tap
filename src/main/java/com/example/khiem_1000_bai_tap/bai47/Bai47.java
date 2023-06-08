package com.example.khiem_1000_bai_tap.bai47;

import java.util.Scanner;

public class Bai47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            do {
                System.out.println(" nhap so lon hon hoac bang 0 ");
                n = scanner.nextInt();
            }
            while (n < 0);
        }
        int chan = demSochan(n);
        System.out.println("trong " + n + " co " + chan + " so chan");
    }

    public static int demSochan(int n) {
        int chan = 0;
        int t = 0;
        for (int i = n; i >= 1; i = i / 10) {
            t = i % 10;
            if (t % 2 == 0) {
                chan++;
            }
        }
        return chan;
    }
}
