package com.company;
import java.util.*;

public class RecievingInputFromUser {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a,b,c,d;
            System.out.println("Enter the number 1:");
            a=sc.nextInt();
            System.out.println("Enter the number 2 :");
            b= sc.nextInt();
            System.out.println("Enter the number 3 :");
            c=sc.nextInt();
            d = a+b+c;
            System.out.println("Addition Result of "+a+" "+b+" "+c+" "+" is : "+d);

        }
    }

}
