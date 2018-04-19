package org.name;

public class A {

    public static B b = new B();

    static {
        System.out.println("A: " + B.var);
    }

    A() {
        System.out.println("A()");
    }

    public static int var = 0x0b;
}
