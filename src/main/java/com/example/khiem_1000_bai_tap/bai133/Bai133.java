package com.example.khiem_1000_bai_tap.bai133;


import java.util.Scanner;

public class Bai133 {
    public static void main(String[] args) {
        int[]mang=new int[100];
        nhapMang(mang,6);
        soAm(mang,6);
    }
    public static void nhapMang(int[]mang,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            mang[i]= scanner.nextInt();
        }
    }
    public static void soAm(int[]mang,int n){
        System.out.println(" Vi tri co gia tri am la ");
        for (int i=0;i<n;i++){
            if(mang[i]<0){
                System.out.print(i+1+" ");
            }
        }
    }
}
