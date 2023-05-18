package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        addSum a = new addSum();
        a.inMethod();
        a.inMethod2();

        //what's diff between getDeclaredMethods and getMethods?
        Method[] mm = a.getClass().getDeclaredMethods();
        for(Method m: mm) {
            MyAnnotation ma = m.getAnnotation(MyAnnotation.class);
            if (ma != null) {
                System.out.println("Method Name: " + m.getName().toUpperCase());
                System.out.println("Author: " + ma.Author());
            }
        }
    }
}
