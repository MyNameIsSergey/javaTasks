package com.company.task4;

import java.util.Scanner;

class Text
{
    private String[] words;
    public Text(String text)
    {
        words = text.split("[ \t\n\r,.]");
    }
    public int countOfWords(String word)
    {
        int count = 0;
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].toLowerCase().compareTo(word.toLowerCase()) == 0)
                count++;
        }
        return count;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < words.length; i++)
            stringBuilder.append(words[i] + " ");
        return stringBuilder.toString();
    }
}

public class Task4 {
    static public boolean task()
    {
        Scanner scanner = new Scanner(System.in);
        Text text = new Text(scanner.nextLine());
        System.out.println(text);
        System.out.println(text.countOfWords(scanner.next()));
        return true;
    }

}
