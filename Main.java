package com.company.calcium_collision;

import java.util.Scanner;

public class Main {

    // Constants for convenience
    final static String space = " ";
    final static String doubleSpaces = "  ";

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner in = new Scanner(System.in);

        // What do i want from the user
        System.out.println("Write the sentence: ");

        // Got String from user
        String gotString = in.nextLine();

        // trim() and send String to method deleteMiddleSpacesRecusrsive
        String sentence = deleteUnusefulSpacesRecusrsive(gotString, true);

        // Use method wordsToReverse
        String reversedString = wordsToReverse(sentence);

        System.out.println(reversedString);

    }

    public static String deleteUnusefulSpacesRecusrsive(String str, boolean trimStr) {
        if (trimStr) {
            str = str.trim();
        }
        if (str.contains(doubleSpaces)) {
            str = str.replace(doubleSpaces, space);
            return deleteUnusefulSpacesRecusrsive(str, false);
        } else {
            return str;
        }
    }

    public static String wordsToReverse (String str){
        StringBuilder reversedWords = new StringBuilder();
        for (String currentWord : str.split(space)){
            for (int b = currentWord.length() - 1; b >= 0; b--){
                reversedWords.append(currentWord.charAt(b));
            }
            reversedWords.append(" ");
        }
        return reversedWords.toString().trim();
    }
}