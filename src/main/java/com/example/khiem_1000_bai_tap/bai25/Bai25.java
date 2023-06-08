package com.example.khiem_1000_bai_tap.bai25;

import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tongchan = bAai25(n);
        System.out.println("tong uoc so chan cua n = " + tongchan);
    }

    public static int bAai25(int n) {
        int tongchan = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                tongchan += i;
            }

        }
        return tongchan;
    }
}
