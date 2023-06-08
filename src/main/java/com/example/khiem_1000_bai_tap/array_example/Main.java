package com.example.khiem_1000_bai_tap.array_example;

import java.util.Scanner;

public class Main {

    /*
    0 1 2 3 4 5 // địa chỉ của bộ nhớ
    // biến mảng sẽ mang địa chỉ của phần tử đầu tiên
    // các phần tử tiếp theo sẽ được cấp phát bộ nhớ liên tiếp sau đó
     */
    public static void main(String[] args) {

        int a; // cấp phát 4 byte
        int[] array1 = new int[20]; // cấp phát 4*20 bytes

        long [] array2 = new long[50]; // cấp phát 8*20 bytes


        array1[0] = 50;
        array1[10] = 100;

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 10) {
            array1[i] = scanner.nextInt();
            i++;
        }

        for (int j = 0; j < 10; j++) {
            System.out.printf("%d ", array1[j]);
        }
        System.out.println();

        int s = 0;
        for (int j = 0; j < 10; j++) {
            s = s + array1[j];
        }
        System.out.println(s);

        int abc = max(array1, 10);
        System.out.printf("Max là %d%n", abc);
//
//        array1[0] = scanner.nextInt();
//        array1[1] = scanner.nextInt();
//        array1[2] = scanner.nextInt();
//        array1[3] = scanner.nextInt();
//        array1[4] = scanner.nextInt();
//        array1[5] = scanner.nextInt();
//        array1[6] = scanner.nextInt();
//        array1[7] = scanner.nextInt();
//        array1[8] = scanner.nextInt();
//        array1[9] = scanner.nextInt();

        scanner.close();
    }


    public static int max(int[] array, int n) {

        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
