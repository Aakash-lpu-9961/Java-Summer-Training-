package com.company;

public class for_loop_java {
    public static void main(String[] args) {
        int i;
        for (i=0;i<20;i++)
        {
            System.out.println("This is loop-"+ (i+1));
        }

        for (int j=0;j<6;j++)
        {
            for (int k=0;k<=j;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
