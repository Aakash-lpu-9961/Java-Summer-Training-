package com.company;

public class Variable_Arguments_Java {

    static int sum(int ...arr)
    {
        // Available as int arr;
        int result=0;
        for (int a: arr)
        {
            result=result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Variable Arguments or Varargs");

        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4, 6 and 5  is: " + sum(4,5,6));
        System.out.println("The sum of 4, 6, 7 and 5  is: " + sum(4,5,6,7));
        System.out.println("The sum of 4, 6, 7, 8 and 5  is: " + sum(4,5,6,7,8));

    }
}
