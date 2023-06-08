package com.example.khiem_1000_bai_tap.bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sumFrom1ToN(n);

        System.out.println(sum);


    }

    public static int sumFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }
}
