package com.company.task2;


import java.util.Scanner;

class CheckNumbers {
    static int leastCommonMultiple(int num1, int num2) {
        return num1 * num2 / greatestCommonFactor(num1, num2);
    }

    static public int greatestCommonFactor(int num1, int num2) {
        int absNum1 = Math.abs(num1), absNum2 = Math.abs(num2);
        for(int i = Math.min(absNum1, absNum2); i > 1; i--)
        {
            if(absNum1 % i == 0 && absNum2 % i == 0)
                return i;
        }
        return 1;
    }

}

public class Task2
{
    static public boolean task() {
        Scanner scanner = new Scanner(System.in);
        int []numbers = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Input " + (i + 1) + "-th number");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            }
            else
            {
                return false;
            }
        }
        System.out.println("Least common multiple: " + CheckNumbers.leastCommonMultiple(numbers[0], numbers[1]));
        System.out.println("Greatest common factor: " + CheckNumbers.greatestCommonFactor(numbers[0], numbers[1]));
        return true;
    }
}
