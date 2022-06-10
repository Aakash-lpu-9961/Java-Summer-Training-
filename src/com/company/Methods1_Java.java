package com.company;
import java.util.Scanner;

public class Methods1_Java {
//    Methods function in Java
    static int logic()
    {
        int b;
        b = 5 +6;
        return b;

    }

    int logic1(int x, int y)
    {
        int z;
        z=x+y;
//        z=+2;
        return z;
    }

    public static void main(String[] args) {
        System.out.println("Methods1 in Java");
        Scanner sc = new Scanner(System.in);

        int d = logic();
        System.out.println(d);

        int ef, eg,em;
        Methods1_Java obj1 = new Methods1_Java();
        Methods1_Java obj2 = new Methods1_Java();
        Methods1_Java obj3 = new Methods1_Java();

        System.out.println("Enter num1: ");
        int xc = sc.nextInt();

        System.out.println("Enter num2: ");
        int yc = sc.nextInt();

        ef = obj1.logic1(xc,yc);
        System.out.println(ef);

        System.out.println("Enter num3: ");
        int pq = sc.nextInt();

        System.out.println("Enter num4: ");
        int pr = sc.nextInt();

        eg = obj2.logic1(pq,pr);
        System.out.println(eg);

        System.out.println("Enter num5: ");
        int qp = sc.nextInt();

        System.out.println("Enter num6: ");
        int rp = sc.nextInt();

        em = obj3.logic1(qp,rp);
        System.out.println(em);
    }
}
