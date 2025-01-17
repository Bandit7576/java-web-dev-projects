package org.launchcode;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search for: ");
        String term = input.nextLine();
        System.out.println(term);
        String sentence = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped into" +
                " the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println(sentence);


        if (sentence.toLowerCase().contains(term.toLowerCase())) {
            System.out.println("Paragraph contains your term!");
        } else {
            System.out.println("Term not found!");
        }
        input.close();
    }
}
