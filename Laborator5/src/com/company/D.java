package com.company;

public class D extends C {
    protected String d;
    protected X x = new X("x in d");

    public D(String a, String b, String c, String d, X x) {
        super(a, b, c, x);
        this.d = d;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getName());
        System.out.println(d);
    }
}