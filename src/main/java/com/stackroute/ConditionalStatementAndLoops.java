package com.stackroute;

import java.util.Scanner;

public class ConditionalStatementAndLoops {
    public static void main(String[] args){ //main
    ConditionalStatementAndLoops conditionalStatementAndLoops = new ConditionalStatementAndLoops();
    conditionalStatementAndLoops.iFCondition(); //Calling If method.
    conditionalStatementAndLoops.forLoop();//Calling Loop Method.
    }
    //Below Method is To Check Number Is Even Or Odd
    public void iFCondition(){
        int inputNumber;
        System.out.println(" Input Number For iFcondition To Check Even Or Odd");
        Scanner scanner = new Scanner(System.in);
        inputNumber=scanner.nextInt();
        if(inputNumber%2==0){   //if number is divisible by 2.It is even
            System.out.println("Number Is Even");
        }
        else //Not a even number
            System.out.println("Number Is Odd");

    }
    //This Method Is To Check Loop Functionality
    public void forLoop(){
        int inputNumber;
        System.out.println("Enter Input number for ForLoop ");
        Scanner scanner = new Scanner(System.in);
        inputNumber=scanner.nextInt();
        for(int i=0;i<inputNumber;i++){ //Iterates Until condition gets Failed
            System.out.println("Hello");//Prints message for every condition
        }
    }

}
