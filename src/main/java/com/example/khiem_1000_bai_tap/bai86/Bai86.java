package com.example.khiem_1000_bai_tap.bai86;

import java.util.Scanner;

public class Bai86 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        double tong=tongBai86(n);
        System.out.println(tong);
    }
    public static double tongBai86(int n){
        double tong=0;
        for(double i=1;i<=n;i++){
            tong+=i*i*i;
        }
        return tong;
    }
}
