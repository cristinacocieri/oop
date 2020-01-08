package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
        public static void main (String[]args) throws Exception {
            String Text = readFile("C:\\Users\\Cristina\\IdeaProjects\\Laborator4\\one_expression.txt");
            CheckParenthesesFromExpression Check1 = new CheckParenthesesFromExpression(Text);
            Check1.isValid();
        }

        static String readFile (String fileName) throws Exception {
            String data;
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        }
    }

