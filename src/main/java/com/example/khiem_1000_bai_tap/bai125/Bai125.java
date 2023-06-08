package com.example.khiem_1000_bai_tap.bai125;

public class Bai125 {
    public static void main(String[] args) {
        int[] mang = new int[100];
        nhapMang(mang, 100);
        mangSNT(mang, 100);


    }

    public static void nhapMang(int[] mang, int n) {
        for (int i = 0; i < n; i++) {
            mang[i] = i;
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static boolean sNt(int m) {
        int dem = 0;

        if (m < 2) {
            return false;
        } else if (m > 2) {
            if (m % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i <= m; i++) {
                    if (m % i == 0) {
                        dem++;
                    }
                }
                if (dem == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void mangSNT(int[] mang, int n) {
        for (int j = 0; j < n; j++) {
            if (sNt(mang[j])) {
                System.out.print(mang[j] + " ");
            }

        }
    }
}
