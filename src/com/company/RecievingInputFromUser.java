package com.company;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class RecievingInputFromUser {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a,b,c,d;
            BigInteger z;
            BigDecimal y;
            System.out.println("Enter the number 1:");
            a=sc.nextInt();
            System.out.println("Enter the number 2 :");
            b= sc.nextInt();
            System.out.println("Enter the number 3 :");
            c=sc.nextInt();
            d = a+b+c;
            System.out.println("Addition Result of "+a+" "+b+" "+c+" "+" is : "+d);

            System.out.println("Enter the BigInteger :");
            z=sc.nextBigInteger();
            System.out.println(z);

            System.out.println("Enter the BigDecimal :");
            y=sc.nextBigDecimal();
            System.out.println(y);

            System.out.println("Enter the number : ");
            boolean b1 = sc.hasNextInt();
            System.out.println(b1);

        }
    }

}

/*
* Methods
*       nextInt()
*       nextFloat()
*       nextDouble()
*       nextByte()
*       nextBoolean()
*       nextLong()
*       nextShort()
*       nextBigInteger()
*       nextBigDecimal()
*       hasNextInt()    - return boolean
* */
