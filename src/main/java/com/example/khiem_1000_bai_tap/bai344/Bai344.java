package com.example.khiem_1000_bai_tap.bai344;

import java.util.*;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Bai344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong Va Cot ");
        int dong = scanner.nextInt();
        int cot = scanner.nextInt();
        List<List<Integer>> arr2d = new ArrayList<>();
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                int a = scanner.nextInt();
                arr2d.get(i).add(a);
            }
        }
        Set<Integer> arr = new HashSet<>();

        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                arr.addAll(arr2d.get(i));
            }
        }
        System.out.println("SL GT Phan biet la " + arr.size());
    }
}
