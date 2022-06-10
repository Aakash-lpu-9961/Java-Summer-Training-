package com.company;

public class Method_Overloading_Java {

    static void foo()
    {
        System.out.println("Good Morning Hi!!!");
    }

    static  void foo(int a)
    {
        System.out.println("Hi!!! Good Morning"+ a);
    }

    static void foo(int a, int b)
    {
        System.out.println("3rd Method: "+a+" , "+b);
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading in Java");

//        Arguments are actual

        foo();
        foo(3000);
        foo(3000,6000);


     }
}

//Method Overloading Cannot be performed by changing the return type of methods