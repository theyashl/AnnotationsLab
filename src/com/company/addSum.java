package com.company;


public class addSum {
    @MyAnnotation(Author = "Yash")
    void inMethod(){
        System.out.println("Inside Method");
    }

    @MyAnnotation(Author = "Mee")
    void inMethod2(){
        System.out.println("2");
    }
}
