package com.company;
import java.util.*;


class student1 {
    String sname;
    public void getDetails()
    {
        System.out.println("My name is : "+ sname);
    }
}

public class OOPs_Concept_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student1[] stu;
        System.out.println("Enter total records u want to enter: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            stu=new student1[n];
            stu[i]=new student1();
        }
        Scanner str = new Scanner(System.in);
        for (int j=0;j<n;j++)
        {
            System.out.println("Enter Emp"+(j+1)+"name: ");

        }
    }
}
