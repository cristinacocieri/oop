package com.company;

public class E extends D {
    protected String e;

    public E(String a, String b, String c, String d, String e, X x) {
        super(a, b, c, d, x);
        this.e = e;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getName());
        System.out.println(e);
    }
}