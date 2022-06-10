package com.company;

public class Method4_Java {
    static int logic(int x)
    {
        int p;
        x=45;
        p=x;
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Method4 Java");

        int b;
        int c = 56;
        System.out.println("Before Calling method: "+c);
        b=logic(56);
        System.out.println("After Calling method: "+c);


    }
}
