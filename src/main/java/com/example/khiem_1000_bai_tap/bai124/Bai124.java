package com.example.khiem_1000_bai_tap.bai124;

import java.util.Scanner;

public class Bai124 {
    public static void main(String[] args) {
        int []mang=new int[8];
        nhapMang(mang,8);
        xuatMang(mang,8);
        giaTrichan(mang,8);


    }
    public static void nhapMang(int[]mang,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            mang[i]= scanner.nextInt();
        }
    }
    public static void xuatMang(int[]mang,int n){
        for(int i=0;i<n;i++){
            System.out.print(mang[i]+" ");
        }
        System.out.println();
    }
    public static void giaTrichan(int[]mang,int n){
        int ktt=0;
        System.out.println(" gia tri chan nho hon 2004  ");
        for(int i=0;i<n;i++){
            if(mang[i]%2==0&&mang[i]<2004){
                System.out.println( mang[i]);
            }
            else {
                ktt++;
            }
        }
        if(ktt==n){
            System.out.println(" khong ton tai ");
        }

    }

}
