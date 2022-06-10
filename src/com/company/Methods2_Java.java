package com.company;

public class Methods2_Java {

    static void change(int [] arr)
    {
        arr[0]=56;
    }

    public static void main(String[] args) {

        int[] marks = {20,30,40,50,60,70,80,90,100};
        System.out.println("Before calling method: "+ marks[0]);
//        Changing the Array
        change(marks);
        System.out.println("The Value of x after running change is: "+ marks[0]);


    }
}
