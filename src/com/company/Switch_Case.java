package com.company;
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        System.out.println("Usage of Switch Case");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        switch (num){
            case 10:
                System.out.println("Block A");
                break;
            case 20:
                System.out.println("Block B");
                break;
            case 30:
                System.out.println("Block C");
                break;
            case 40:
                System.out.println("Block D");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        System.out.println("Out of the scope of switch");

        System.out.println("Switch case using char variable");

        char var='A';
        switch (var){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("D");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        System.out.println("Out of Scope");


    }
}
