package com.company;

public class F extends E {
    protected String f;

    public F(String a, String b, String c, String d, String e, String f, X x) {
        super(a, b, c, d, e, x);
        this.f = f;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getName());
        System.out.println(f);
    }
}