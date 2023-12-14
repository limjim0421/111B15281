package chap13;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class ArgumentOutOfBound extends Exception {
}

public class Ex19 {
    public static boolean prime(int n) throws ArgumentOutOfBound {
        if (n <= 1) {
            throw new ArgumentOutOfBound();
        }
        boolean check = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            if (prime(sc.nextInt())) {
                System.out.println("您輸入的值為質數");
            } else {
                System.out.println("您輸入的值不是質數");
            }
        } catch (InputMismatchException e) {
            System.out.println("請輸入整數");
        } catch (ArgumentOutOfBound e) {
            System.out.println("請輸入大於1的整數");
        }
    }
}
