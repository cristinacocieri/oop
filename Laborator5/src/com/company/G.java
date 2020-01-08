package com.company;

public class G extends F {
    protected String g;

    public G(String a, String b, String c, String d, String e, String f, String g, X x) {
        super(a, b, c, d, e, f, x);
        this.g = g;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getName());
        System.out.println(g);
    }
}