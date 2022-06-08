package com.company;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
//        String Methods in Java
        System.out.println("String Methods");
        String name = "Aakash";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = "      Sagar       ";
        System.out.println(name1);
        System.out.println(name1.trim());

        String name2 = "Aakash";
        System.out.println(name2.substring(2));
        System.out.println(name2.substring(2,4));       // 4th character not included
        System.out.println(name2.replace('k','m'));
        System.out.println(name2.replace("Aak","Nak"));
        System.out.println(name2.repeat(5));
        System.out.println(name2.startsWith("Aak"));
        System.out.println(name2.endsWith("ash"));
        System.out.println(name2.charAt(2));        // What is character at index 2
        System.out.println(name2.indexOf("sh"));
        System.out.println(name2.indexOf('s'));
        System.out.println(name2.indexOf("Aak", 2));
        System.out.println(name2.indexOf("Aak", 1));
        System.out.println(name2.lastIndexOf("ash", 5));
        System.out.println(name2.equals("Aakash"));     // True
        System.out.println(name2.equals("aakash"));     // False

        System.out.println("Completed ALl Methods");






    }
}
