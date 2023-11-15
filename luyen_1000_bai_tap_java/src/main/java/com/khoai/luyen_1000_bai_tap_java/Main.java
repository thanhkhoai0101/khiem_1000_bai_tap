package com.khoai.luyen_1000_bai_tap_java;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String exe;
        String nFormat;
        int n = 0;
        int x;
        int next;
        int number;
        int flag;

        do {
            Scanner input = new Scanner(System.in);
            flag = 0;
            do {
                System.out.print("Bạn muốn kiểm tra bài: ");
                exe = input.nextLine();
                if (isNumeric(exe))
                    number = Integer.parseInt(exe);
                else {
                    System.out.println("Số bài không hợp lệ, Vui lòng nhập lại.");
                    number = 0;
                }
                if (number == 0) {
                    System.out.println("Số bài không hợp lệ, Vui lòng nhập lại.");
                }
            } while (number <= 0);

//            Đề bài
            switch (number) {
                case 1:
                    System.out.println("1. Tính S(n) = 1 + 2 + 3 + ... + n.");
                    break;
                case 2:
                    System.out.println("2. Tính S(n) = 1^2 + 2^2 + 3^2 + ... + n^2.");
                    break;
                case 3:
                    System.out.println("3. Tính S(n) = 1 + 1/2 + 1/3 + ... + 1/n.");
                    break;
                case 4:
                    System.out.println("4. TínhS(n)=1/2 + 1/4 +...1/(2n)");
                    break;
                case 5:
                    System.out.println("5. Tính S(n) = 1 + 1/3 + 1/5 + ... + 1/(2n+1) .");
                    break;
                case 6:
                    System.out.println("6. Tính S(n) = 1/(1x2) + 1/(2x3) +...+ 1/(nx(n+1)) .");
                    break;
                case 7:
                    System.out.println("7. Tính S(n)=1/2 + 2/3 + 3/4...+ n/(n+1)");
                    break;
                case 8:
                    System.out.println("8. Tính S(n)=1/2+3/4+ 5/6...+(2n+1)/(2n+2)");
                    break;
                case 9:
                    System.out.println("9. Tính T(n)=1x2x3....xn.");
                    break;
                case 10:
                    System.out.println("10. Tính T(x, n) = x^n.");
                    break;
                default:
                    System.out.println("Chưa có làm :)))");
                    flag = 1;
                    break;
            }

            if (flag == 0) {
//                 Nhập N
                do {
                    System.out.print("Nhập N: ");
                    nFormat = input.nextLine();
                    if (isNumeric(nFormat)) {
                        n = Integer.parseInt(nFormat);
                    } else {
                        System.out.println("N không hợp lệ, Vui lòng nhập lại n: ");
                    }
                } while (n == 0);

//            Xử lý
                switch (number) {
                    case 1: {
                        System.out.println("Kết quả là: " + Bai01.sumFromOneToN(n));
                    }
                    break;
                    case 2: {
                        System.out.println("Kết quả là: " + Bai02.sumOfSquaresFromOneToN(n));
                    }
                    break;
                    case 3: {
                        System.out.println("Kết quả là: " + Bai03.sumFromOneToOneDivisionN(n));
                    }
                    break;
                    case 4: {
                        System.out.println("Kết quả là: " + Bai04.sumFromOneToOneDivisionEven(n));
                    }
                    break;
                    case 5: {
                        System.out.println("Kết quả là: " + Bai05.sumFromOneToOneDivisionOdd(n));
                    }
                    break;
                    case 6: {
                        System.out.println("Kết quả là: " + Bai06.sumFromOneToOneDivisionNextN(n));
                    }
                    break;
                    case 7: {
                        System.out.println("Kết quả là: " + Bai07.sumNDivisionNextN(n));
                    }
                    break;
                    case 8:
                        System.out.println("Kết quả là: " + Bai08.sumOddDivisionEven(n));
                        break;
                    case 9:
                        System.out.println("Kết quả là: " + Bai09.factorial(n));
                        break;
                    case 10: {
                        System.out.print("Nhập x: ");
                        x = input.nextInt();
                        System.out.println("Kết quả là: " + Bai10.exponential(x, n));
                    }
                    break;

                    default:
                        System.out.println("Chưa làm :))");break;
                }
            }

            System.out.println("Nhấn 1 để tiếp tục, nhấn 0 để thoát.");
            next = input.nextInt();

        } while (next != 0);

    }

    public static boolean isNumeric(String str) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
}


class Bai01 {
    public static int sumFromOneToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}

class Bai02 {
    public static int sumOfSquaresFromOneToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }
}

class Bai03 {
    public static double sumFromOneToOneDivisionN(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }

        return sum;
    }
}

class Bai04 {
    public static double sumFromOneToOneDivisionEven(int n) {
        double sum = 0;

        for (int i = 2; i <= 2 * n; i += 2) {
            sum += (1.0 / i);
        }

        return sum;
    }
}

class Bai05 {
    public static double sumFromOneToOneDivisionOdd(int n) {
        double sum = 0;

        for (int i = 1; i <= (2 * n + 1); i += 2) {
            sum += (1.0 / i);
        }

        return sum;
    }
}

class Bai06 {
    public static double sumFromOneToOneDivisionNextN(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * (i + 1));
        }

        return sum;
    }
}

class Bai07 {
    public static double sumNDivisionNextN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i / (i + 1.0);
        }

        return sum;
    }
}

class Bai08 {
    public static double sumOddDivisionEven(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (2 * i + 1) / (2.0 * i + 2);
        }

        return sum;
    }
}

class Bai09 {
    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

class Bai10 {
    public static long exponential(int x, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }
}
