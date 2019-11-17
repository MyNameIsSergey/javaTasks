package com.company.task1;

import java.util.Scanner;


class CheckNumber {
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static boolean isSimple(int num) {
        for (int i = (int) Math.round(Math.sqrt(num)); i > 1; i -= 1) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static String check(int num) {
        String message = "";
        if (isEven(num)) {
            message += "Even\n";
        } else {
            message += "Odd\n";
        }
        if (isSimple(num)) {
            message += "Prime";
        } else {
            message += "Composite";
        }
        return message;
    }


}

public class Task1
{
    static boolean task() {
        System.out.println("Input num: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println(CheckNumber.check(scanner.nextInt()));
        } else {
            return false;
        }
        return true;
    }
}