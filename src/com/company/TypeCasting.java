package com.company;

public class TypeCasting {
    public static void main(String [] args){
        System.out.println("===============================================================");
        System.out.println("\t\t\t\tTypecasting in Java");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Implicit Type Conversion : Automatically done by compiler");
        System.out.println("byte->short->int->long->double");
//        byte a = 1;
//        short b = a;
        short b = (byte)1;      // Alternative
        System.out.println(b);

        int c = (short)4;
        System.out.println(c);

        long d = (short)4;
        System.out.println(d);

        float e = (byte)5.55;
        System.out.println(e);

        double f = (float)9.2;
        System.out.println(f);

        System.out.println("-----------------------------------------------------------");

        System.out.println("Explicit Type Conversion : Done manually by programmer");
        System.out.println("double->float->long->int->short->byte");
//        long a = 555;
//        int g = a;
//        System.out.println(g);    gives error

        long a = 555;
        int g = (int)a;         // Explicit Type Conversion
        System.out.println(g);

        double h = 56848448;
        byte i = (byte) h;
        System.out.println(i);

        float j = 5678.986f;
        int k = (int)j  ;
        System.out.println(k);



    }
}
