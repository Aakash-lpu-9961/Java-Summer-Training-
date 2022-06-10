package com.company;

public class for_each_loop_java {
    public static void main(String[] args) {
        int[] marks = {55,66,78,88,44,10};
        System.out.println(marks.length);


//         first method of displaying array
        for (int a: marks)
        {
            System.out.println("first method of displaying array:"+a);
        }
        System.out.println(" ");


//        second method for displaying array
        for (int i=0;i<marks.length;i++)
        {
            System.out.println("second method of displaying array:"+marks[i]);
        }
        System.out.println(" ");



    }
}
