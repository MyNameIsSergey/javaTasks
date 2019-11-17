package com.company.task5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class Sequence {
    ArrayList<Integer> sequence = new ArrayList<>();


    public Sequence() {
    }
    public Sequence(int[] source) {
        sequence = new ArrayList<>(source.length);
        for (int item : source ) {
            sequence.add(item);
        }
    }
    public Sequence(ArrayList<Integer> source) {
        sequence = new ArrayList<>(source.size());
        for (int item : source ) {
            sequence.add(item);
        }
    }

    public void add(int num)
    {
        sequence.add(num);
    }
    public Sequence findSequence(Predicate<Integer> predicate)
    {
        Sequence newSequence = new Sequence();
        for (int item : this.sequence) {
            if(predicate.test(item))
                newSequence.sequence.add(item);
        }
        return newSequence;
    }
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i : sequence)
            stringBuilder.append(i + " ");
        return stringBuilder.toString();

    }
}

public class Task5 {
    static Scanner scanner = new Scanner(System.in);

    static public boolean isPalindrome(int num) {
        int length = (int) Math.pow(10, (int) Math.log10(num));
        for (int i = 10; length != 0; num /= 10, length /= 100) {
            if (num % 10 != num / length % 10)
                return false;
        }
        return true;
    }

    static int[] tryInputArray()
    {
        int[] numbers;
        if (scanner.hasNextInt()) {
            numbers = new int[scanner.nextInt()];
        } else
            return null;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input " + (i + 1) + "-th number");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else
                return null;
        }
        return numbers;

    }

    static public boolean task() {
        int[] numbers = tryInputArray();
        if(numbers == null)
            return false;
        Predicate<Integer> palindrome = i -> isPalindrome(i);
        Sequence sequence = new Sequence(numbers);
        System.out.println("Palindromes:\n" + sequence.findSequence(palindrome));
        return true;
    }
}