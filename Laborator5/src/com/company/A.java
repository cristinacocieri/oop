package com.company;

public class A {
    protected String a;
    protected X x = new X("x in a");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void printProperty() {
        System.out.println(x.getName());
        System.out.println(a);
    }
}
