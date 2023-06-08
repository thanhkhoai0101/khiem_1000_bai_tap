package com.example.khiem_1000_bai_tap.bai63;

import java.util.Scanner;

public class Bai63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int bMin = bCNn(a, b);
        System.out.println("BCNN cua a va b la "+bMin);

    }

    public static int bCNn(int a, int b) {
        int bMin = 0;
        int max=a;
        if(b>max){
            max=b;
        }
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                bMin = i;
                break;
            }


        }
        return bMin;
    }
}
