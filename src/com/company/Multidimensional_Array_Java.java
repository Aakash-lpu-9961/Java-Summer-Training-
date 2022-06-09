package com.company;

public class Multidimensional_Array_Java {
    public static void main(String[] args) {
        System.out.println("Multidimensional Array in Java");
//        Multidimensional Arrays are Arrays of Arrays. Each element of M-D Array is an Array itself.
        int[] marks;    // A 1-D Array
        int[][]flats;   // A 2-D Array
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

//        Displaying Multidimensional Array by nested for loop
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
