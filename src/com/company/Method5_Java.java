package com.company;

public class Method5_Java {
    static void display(int num)
    {
        num = 50;
    }

    public static void main(String[] args) {
        int number = 25;
        System.out.println("Before:"+number);
        display(number);
        System.out.println("After:"+number);

    }
}
