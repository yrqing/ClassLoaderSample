package com.company;

import org.name.F;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

//        ClassLoader classLoader = Main.class.getClassLoader();
//        System.out.println(classLoader);
//
//        Class<?> clazz = classLoader.loadClass("com.company.A");
//
//        Class<?> aClass = Class.forName("com.company.A");
//
//        Class<?> bClass = Class.forName("com.company.A");
//
//        System.out.println(aClass == bClass);
//
//
//
//        System.out.println(aClass == clazz);

        System.out.println(ClassLoader.getSystemClassLoader());


        MyClassLoader m = new MyClassLoader();
//        Class<?> c = m.loadClass("com.company.o.D");
        Class<?> c = m.loadClass("org.name.F");
        System.out.println(F.class.getClassLoader());

        System.out.println(c);
        System.out.println(c.getClassLoader());


    }
}
