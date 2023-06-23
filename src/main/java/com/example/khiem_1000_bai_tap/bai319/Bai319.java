package com.example.khiem_1000_bai_tap.bai319;

import java.util.Scanner;

public class Bai319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dong va So Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        nhap(arr, dong, cot);
        xUat(arr, dong, cot);
        System.out.println("Ma tran sau khi sap xep tang dan dong va cot ");
//        int n = dong * cot;
//        int[] arr2 = new int[n];
//        gopMangTangdan(arr, dong, cot, arr2, n);
//        tachMang(arr, dong, cot, arr2, n);  //c1

        //c2
//        sapXepTangDanCachThu2(arr, dong, cot);
        //c3
        a(arr, dong, cot);

        xUat(arr, dong, cot);

    }

    public static void nhap(int[][] arr, int dong, int cot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhap Dong " + i + " Cot " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xUat(int[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //c1
    public static void gopMangTangdan(int[][] arr, int dong, int cot, int[] arr2, int n) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                arr2[dem] = arr[i][j];
                dem++;
            }
        }
        int tam;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] > arr2[j]) {
                    tam = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = tam;
                }
            }
        }

    }

    public static void tachMang(int[][] arr, int dong, int cot, int[] arr2, int n) {
        int dem = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = arr2[dem];
                dem++;
            }
        }

    }

    //c2
    public static void sapXepTangDanCachThu2(int[][] arr, int dong, int cot) {
        int tam;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                for (int k = i; k < dong; k++) {
                    for (int l = j; l < cot; l++) {
                        if (arr[i][j] > arr[k][l]) {
                            tam = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = tam;
                        }
                    }
                }
            }
        }
    }

    public static void a(int[][] arr, int dong, int cot) {
        int n = dong * cot - 1;
        int tam;
        int a, b, c, d;
        for (int i = 0; i <= n; i++) {
            a = i / cot;
            b = i % cot;
            for (int j = i; j <= n; j++) {
                c = j / cot;
                d = j % cot;
                if (arr[a][b] > arr[c][d]) {
                    tam = arr[a][b];
                    arr[a][b] = arr[c][d];
                    arr[c][d] = tam;
                }
            }
        }
    }
}
/*
dong 3
cot 4
n=12

           i;0  ;1 ;2 ;3 ;4 ;5 ;6 ;7 ;8 ;9 ;10;11;
arr[i/4][i%4];00;01;02;03;10;11;12;13;20;21;22;23
arr[i/3][j%3];00;01;02;10;11;12;13;20;21;22;30;31;
 */
