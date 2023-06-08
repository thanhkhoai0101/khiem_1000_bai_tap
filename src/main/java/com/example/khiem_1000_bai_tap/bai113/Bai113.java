package com.example.khiem_1000_bai_tap.bai113;

import java.util.Scanner;

public class Bai113 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int x= scanner.nextInt();
        double tong=tongBai113(n,x);
        System.out.println(Math.sin(tong));

    }
    public static double tongBai113(int n,int x){
        double tong=0;
       int tich=1;
        for (int i=1;i<=n;i++){
            tich*=(i*2)*(i*2+1);
            tong+=Math.pow(-1,i+1)*(Math.pow(x,2*i+1)/tich);
        }
        return tong;
    }

}
