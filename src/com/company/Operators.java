package com.company;

public class Operators {
    public static void main(String[] args) {
        int a =4;
        int b= 6+a;         // Addition Operator
        System.out.println(b);

        int c=4;
        int d=5;
        int e = c*d;        // Multiplication Operators
        System.out.println(e);

        int f=4;
        int g=6%f;          // Modulo Operator
        System.out.println(g);

        int h=5;
        h+=3;               // Assignment Operator
        System.out.println(h);

        int i=10;
        int j=20;
        System.out.println(i>j);        // Comparison Operator
        System.out.println(i<j);
        System.out.println(i==j);
        System.out.println(i!=j);

        int k=30;
        int l=45;
        System.out.println(k>l && i>j);     // Logical Operators
        System.out.println(a<b || k<l);

        System.out.println(k&l);        // Bitwise Operators
        System.out.println(k|l);

        int m=5;
        System.out.println(m++);        // 5   // Unary Operator
        System.out.println(++m);        // 7
        System.out.println(m--);        // 7
        System.out.println(--m);        // 5

    }
}
