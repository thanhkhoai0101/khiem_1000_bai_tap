package com.example.khiem_1000_bai_tap.bai85;

import java.util.Scanner;

public class Bai85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        do {
            thang = scanner.nextInt();
        }
        while (thang > 12 || thang < 1);

        int quy = Q(thang);
        System.out.println(quy);
    }

    public static int Q(int thang) {
        int quy = 1;
        if (thang >= 4) {
            quy = 2;
        }
        if (thang >= 7) {
            quy = 3;
        }
        if (thang >= 10) {
            quy = 4;
        }
        return quy;
    }
}
