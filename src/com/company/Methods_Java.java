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
/*        Sometimes our program grown in size, and we want to separate the logic of main method to other
        methods.
        for instance - If we are calculating average of a number pair 5 times, we can use methods to avoid
                        repeating the logic.

          Uses DRY Principle (Don't repeat yourself)

          Methods - A Method is a function written inside a class since Java is object-oriented language
          we need to write the method inside same class.
 */

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Variable a: ");
        a = sc.nextInt();

        System.out.println("Enter Variable b: ");
        b = sc.nextInt();

        c = logic(a,b);
        System.out.println(c);


    }
}
