package com.example.khiem_1000_bai_tap.bai83;

import java.util.Scanner;

public class Bai83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a * b > 0) {
            System.out.println("a va b cung dau ");
        } else {
            System.out.println("a va b khac dau ");
        }

    }

}
