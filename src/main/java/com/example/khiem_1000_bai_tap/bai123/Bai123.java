package com.example.khiem_1000_bai_tap.bai123;

import java.util.Scanner;

public class Bai123 {
    public static void main(String[] args) {
        int[]mang=new int[8];
        nhapMang(mang,8);
        xuatMang(mang,8);
        int min2=mangNN(mang,8);
        System.out.println(" vi tri mang co gia tri nho nhat la "+min2);
    }
    public static void nhapMang(int[]mang,int n){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<n;i++){
            mang[i]= scanner.nextInt();
        }
    }
    public static void xuatMang(int[]mang,int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+mang[i]);
        }
    }
    public static int mangNN(int[]mang,int n){
        int min1=mang[0];
        int min2=0;
        for(int i=1;i<n;i++){
            if(mang[i]<min1){
                min1=mang[i];
                min2=i+1;
            }
        }
        return min2;
    }

}
