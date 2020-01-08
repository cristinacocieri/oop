package com.company;

public class Main {
    public static void main(String[] argv) {
        J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", new X("nameX"));

        j.printProperty();
    }
}
