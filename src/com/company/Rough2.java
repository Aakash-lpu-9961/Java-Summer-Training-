package com.company;
import java.math.BigInteger;
import java.util.*;

public class Rough2 {
    public static void main(String[] args){
        System.out.println("Hello Open");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter repetition:");
        int rep=sc.nextInt();
        int[] num = new int[rep];
        for (int i=0;i<rep;i++)
        {
            System.out.println("Enter: ");
            num[i] = sc.nextInt();
            System.out.println(num[i]);
        }
        Scanner str = new Scanner(System.in);
        System.out.println("Enter Your Password:");
        String name = str.nextLine();
        System.out.println(name);

        if(Objects.equals(name, "Aakash"))
        {
            System.out.println("Ok Verified!!!");
            System.out.println("Enter Your Pin: ");
            int pin = sc.nextInt();
            System.out.println("Entered Pin:"+pin);
            System.out.println("PROCEED \t"+" "+"\t CANCEL");
            String ans = str.nextLine();
            if (Objects.equals(ans,"PROCEED"))
            {
                System.out.println("Enter Account Number: ");
                int acc = sc.nextInt();
                System.out.println("Enter Amount Want to Deposit: ");
                int wit = sc.nextInt();
                System.out.println("Choose the Operation u want to perform");
                System.out.println("[1]\t\t Money Transfer");
                System.out.println("[2]\t\t Bank Balance");
                int num1 =sc.nextInt();
                switch (num1){
                    case 1:
                        System.out.println("Enter Depositor Acc No: ");
                        int depacc = sc.nextInt();
                        System.out.println("Enter amount want to transfer: ");
                        int depamt = sc.nextInt();
                        System.out.println("Amount Deposited Successfully");
                        break;
                    case 2:
                        System.out.println("Bank Balance");
                        System.out.println(wit);
                }
            }
            else
            {
                System.out.println("CANCELLED SUCCESSFULLY !!!");
                System.out.println("Thanks For Choosing Us");
            }
        }
        else
        {
            System.out.println("ERROR!!!");
        }
    }
}
