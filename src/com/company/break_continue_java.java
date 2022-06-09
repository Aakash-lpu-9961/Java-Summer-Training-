package com.company;

public class break_continue_java {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Out of the for loop");

        int j=1;
        while (j<50)
        {
            System.out.println("This is while loop");
            if (j==4)
            {
                System.out.println("Inside if statement of while loop");
                break;
            }
            j++;
        }

        for (int k=0;k<10;k++)
        {
            System.out.println("Inside for loop for continue statement");
            if (k==4)
            {
                System.out.println("Inside if statement of for loop");
                continue;
            }
            k++;
        }
    }
}
