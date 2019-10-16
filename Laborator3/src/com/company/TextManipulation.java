package com.company;
import java.lang.Character;

public class TextManipulation {

    public static int CountWords(String str) {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        System.out.println("The number of words is: " + count);
        return count;
    }

    public static int CountSentences(String str){
        int count = 0;
        char ch;
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if( ch == '.' || ch == '!' || ch == '?') {
            count++;
            }
        }
        System.out.println("The number of sentences is: " + count);
        return 0;
    }

    public static int CountLetters(String str) {
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                charCount++;
        }
        System.out.println("The number of letters is: " + charCount);
        return charCount;
    }

    public static void CountVowelsConsonants(String str) {
        int VowelsCount = 0;
        int ConsonantsCount = 0;
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                VowelsCount++;
            } else {
                ConsonantsCount++;
                if (!Character.isLetter(ch)) {
                    ConsonantsCount--;
                }
            }
        }
            System.out.println("The number of vowles is: " + VowelsCount);
            System.out.println("The number of consonants is: " + ConsonantsCount);

        }
    }



