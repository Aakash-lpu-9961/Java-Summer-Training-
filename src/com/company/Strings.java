package com.company;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String fname;
        String sname1;
//        Strings in Java
        /*
            Strings are Immutable i.e., It can't be modified
         */

        String name = new String("Aakash");
        System.out.println(name );

        String name1 = "Aakash";
        System.out.println("My name is :"+name1+" using println method");
        System.out.print("My name is:"+name1+" using print method");
        System.out.println(" ");

        int a=5;
        float b=3.56f;
        System.out.printf("The value of integer a is :%d and value of float b is :%f",a,b);
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your father's name: ");
//        fname= sc.next();           // Reads only first words of the String
        sname1= sc.nextLine();      // Reads whole String

//        System.out.println(fname);
        System.out.println(sname1);





    }
}

/*
    Different Methods in Java
        [1] System.out.print();
        [2] System.out.println();
        [3] System.out.printf("%c", ch);    // %c, %d, %f, %s
        [4] System.out.format();
 */
