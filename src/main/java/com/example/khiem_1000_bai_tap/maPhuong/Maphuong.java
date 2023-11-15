package com.example.khiem_1000_bai_tap.maPhuong;

import java.util.Scanner;

public class Maphuong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        while (n < 3) {
            System.out.println("Nhap N > 2");
            n = scanner.nextInt();
        }
        if (n % 4 == 0) {
            taoMaPhuongChanKep(arr, n);
        } else if (n % 2 != 0) {
            taoMaPhuongLe(arr, n);
        } else {
            System.out.println("Chưa làm xong ");
        }
        System.out.println("Ma Phuong Bac " + n);
        output(arr, n);

    }

    public static void output(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void taoMaPhuongChanKep(int[][] arr, int n) {
        int k = 1;
        int a = n * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + 1 - i) % 4 == 1 || (j + 1 + i) % 4 == 0) {
                    arr[i][j] = k;
                } else {
                    arr[i][j] = a - k;
                }
                k++;
            }
        }
    }

    public static void taoMaPhuongLe(int[][] arr, int n) {
        int ii = 0;
        int jj = n / 2;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[ii][jj] = k;
                ii--;
                jj++;
                if (k % n == 0) {
                    ii += 2;
                    jj--;
                } else if (ii < 0) {
                    ii = n - 1;
                } else if (jj >= n) {
                    jj = 0;
                }
                k++;
            }
        }
    }
}
