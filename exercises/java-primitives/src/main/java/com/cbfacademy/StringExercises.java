package com.cbfacademy;

import java.util.Arrays;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String stringOfCharacters = Arrays.toString(characters);
        return stringOfCharacters;
    }

    public long howMany(String text, Character character) {
        //
        // TODO - Write code to determine how many of the input ${character} are
        // contained in the input ${text}
        long count = 0L;

        for (int i = 0; i < text.length(); i++) {
            if (character == text.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public String getName() {
        return "String Exercises";
    }
}
