package com.example.khiem_1000_bai_tap.bai105;

import java.util.Scanner;

public class Bai105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int DV = n % 10;
        n = n / 10;
        int chuc = n % 10;
        int tram = n / 10;

        if (tram == 9) {
            System.out.println(" chin ");
        } else if (tram == 8) {
            System.out.println(" tam ");
        } else if (tram == 7) {
            System.out.println(" bay ");
        } else if (tram == 6) {
            System.out.println(" sau ");
        } else if (tram == 5) {
            System.out.println(" nam ");
        } else if (tram == 4) {
            System.out.println(" bon ");
        } else if (tram == 3) {
            System.out.println(" ba ");
        } else if (tram == 2) {
            System.out.println(" hai ");
        } else if (tram == 1) {
            System.out.println(" mot ");
        }

        System.out.println(" Tram ");

        if (chuc == 9) {
            System.out.println(" chin ");
        } else if (chuc == 8) {
            System.out.println(" tam ");
        } else if (chuc == 7) {
            System.out.println(" bay ");
        } else if (chuc == 6) {
            System.out.println(" sau ");
        } else if (chuc == 5) {
            System.out.println(" nam ");
        } else if (chuc == 4) {
            System.out.println(" bon ");
        } else if (chuc == 3) {
            System.out.println(" ba ");
        } else if (chuc == 2) {
            System.out.println(" hai ");
        }

        System.out.println(" Muoi ");

        if (DV == 9) {
            System.out.println(" chin ");
        } else if (DV == 8) {
            System.out.println(" tam ");
        } else if (DV == 7) {
            System.out.println(" bay ");
        } else if (DV == 6) {
            System.out.println(" sau ");
        } else if (DV == 5) {
            System.out.println(" nam ");
        } else if (DV == 4) {
            System.out.println(" bon ");
        } else if (DV == 3) {
            System.out.println(" ba ");
        } else if (DV == 2) {
            System.out.println(" hai ");
        } else if (DV == 1) {
            System.out.println(" mot ");
        }
    }

}
