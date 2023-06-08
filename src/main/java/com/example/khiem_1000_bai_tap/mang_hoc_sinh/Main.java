package com.example.khiem_1000_bai_tap.mang_hoc_sinh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        inputStudent(students, 5);
        outputStudent(students, 5);

    }

    public static void inputStudent(Student[] students, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <n; i++) {
            System.out.printf("Nhập học sinh thứ %d: %n", i);
            students[i] = new Student();
            System.out.print("Nhập họ tên: ");
            students[i].setName(scanner.nextLine());
            System.out.print("Nhập điểm toán: ");
            students[i].setMath(scanner.nextFloat());
            System.out.print("Nhập điểm văn: ");
            students[i].setLiterary(scanner.nextFloat());

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
        System.out.println("Kết thúc nhập");

    }

    public static void outputStudent(Student[] students, int n) {
        System.out.println("Họ tên \t\t\t\tĐiểm toán\tĐiểm văn\tĐiểm trung bình%n");
        for (int i = 0; i <n ; i++) {
            System.out.printf("%s\t\t%f\t%f%n", students[i].getName(), students[i].getMath(), students[i].getLiterary(), students[i].getAvg());
        }

    }
}
