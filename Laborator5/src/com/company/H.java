package com.company;

public class H extends G {
    protected String h;
    protected X x = new X("x in h");

    public H(String a, String b, String c, String d, String e, String f, String g, String h, X x) {
        super(a, b, c, d, e, f, g, x);
        this.h = h;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getName());
        System.out.println(h);
    }
}