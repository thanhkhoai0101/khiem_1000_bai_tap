package com.example.khiem_1000_bai_tap.bai29;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxle = bAi29(n);
        System.out.println("so le lon nhat cua uoc n la " + maxle);
    }

    public static int bAi29(int n) {
        int maxle = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                if (i > maxle) {
                    maxle = i;
                }
            }
        }
        return maxle;
    }
}
