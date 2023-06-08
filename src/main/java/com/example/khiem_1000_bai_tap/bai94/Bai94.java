package com.example.khiem_1000_bai_tap.bai94;

public class Bai94 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += 2) {
            if(i == 5||i==7||i==93){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
