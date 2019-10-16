package com.company;
import java.lang.Character;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Text = "Moldova is a small country in Eastern Europe. Its rich soil and temperate continental climate with warm summers and mild winters have made the country one of the most productive agricultural regions since ancient times, and a major supplier of agricultural products in southeastern Europe. Moldova’s fertile soil produces fruits, vegetables and grain products and one of the most important industries of the country is wine - making, for which Moldova is known far beyond its borders. For many years, wine-making in Moldova was the basic occupation of the population.";

        TextManipulation.CountWords(Text);
        TextManipulation.CountSentences(Text);
        TextManipulation.CountLetters(Text);
        TextManipulation.CountVowelsConsonants(Text);

    }
}
