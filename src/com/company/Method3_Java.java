package com.company;

public class Method3_Java {

    static  int change_num(int x)
    {
        x = 45;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Method3 Java");
        int c;
        int m=56;
        System.out.println("Before calling method:"+m);
        c = change_num(m);
        System.out.println("After calling method:"+c);

    }
}
