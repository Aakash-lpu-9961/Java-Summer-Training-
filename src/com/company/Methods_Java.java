package com.company;
import java.util.Scanner;

public class Methods_Java {

   static int logic(int x, int y)
    {
        int z;
        if (x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }


    public static void main(String[] args) {
        System.out.println("Methods in Java");
        Scanner sc = new Scanner(System.in);

        int a,b,c;
//        int d;

//        Making Object of the class and then accessing  the method
//        Methods_Java obj = new Methods_Java();



        System.out.println("Enter Variable a: ");
        a = sc.nextInt();

        System.out.println("Enter Variable b: ");
        b = sc.nextInt();

//        d = obj.logic(a,b);
//        System.out.println(d);

        c = logic(a,b);
        System.out.println(c);


    }
}
