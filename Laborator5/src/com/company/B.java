package com.company;

    public class B extends A {
        protected String b;

        public B(String a, String b, X x) {
            super(a, x);
            this.b = b;
        }

        public void printProperty() {
            super.printProperty();
            System.out.println(x.getName());
            System.out.println(b);
        }
    }

