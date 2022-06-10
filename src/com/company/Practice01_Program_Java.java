package com.company;

// Problem-01 : Program to find the minimum and maximum element in an Array
public class Practice01_Program_Java {
    public static void main(String[] args) {
        System.out.println("Practice Program Java - 01");
//        declaring an array
        int[] num = {12,16,84,22,11,9,6,1,18};
        int max = num[0];
        for (int i=1;i<num.length;i++)
        {
            if (num[i]>max)
            {
                max = num[i];
            }
        }
        System.out.println("Maximum Element is : "+ max);

        int min = num[0];
        for (int j=1;j<num.length;j++)
        {
            if (num[j]<min)
            {
                min = num[j];
            }
        }
        System.out.println("Minimum Element is :"+min);


    }
}
