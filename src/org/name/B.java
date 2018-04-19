package org.name;

public class B {

    public static A a = new A();
    public static int var = 0x0a;

    static {
        System.out.println("B: " + A.var);
    }

    B() {
        System.out.println("B()");
    }

    public static void main(String[] args) {

        System.out.println("main");
    }
}
