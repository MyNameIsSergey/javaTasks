package com.company.task3;


import java.util.Scanner;

class Sentence {
    private String[] text;

    public Sentence(String text) {
        this.text = text.split(" ");
    }

    public Sentence(String[] text) {
        this.text = text.clone();
    }

    public Sentence sortedWords() {
        String[] sorted = text.clone();
        for (int i = 0; i < sorted.length; i++) {
            int index = i;
            for (int j = i; j < sorted.length; j++) {
                if (sorted[index].toLowerCase().compareTo(sorted[j].toLowerCase()) > 0) {
                    index = j;
                }
                String temp = sorted[index];
                sorted[index] = sorted[i];
                sorted[i] = temp;
            }
        }
        return new Sentence(sorted);
    }

    public String[] getWords() {
        return text.clone();
    }

    public int quantityWords() {
        return text.length;
    }

    public Sentence toUpper() {
        String[] words = text.clone();
        for (int i = 0; i < words.length; i++)
            words[i] = words[i].toUpperCase();
        return new Sentence(words);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < text.length; i++)
            stringBuilder.append(text[i] + " ");
        return stringBuilder.toString();
    }
}

public class Task3 {
    static public boolean task()
    {
        Scanner scanner = new Scanner(System.in);
        Sentence text = new Sentence(scanner.nextLine());
        Sentence strings = text.sortedWords();
        System.out.println("Quantity of words: " + text.quantityWords());
        System.out.println("Sorted text:");
        System.out.print(strings);
        System.out.println("\nUppercase:");
        System.out.println(text.toUpper());
        return true;
    }
}
