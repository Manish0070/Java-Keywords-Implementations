package com.stackroute;

import java.util.Scanner;

public class ConditionalStatementAndLoops {
    public static void main(String[] args) { //main
        ConditionalStatementAndLoops conditionalStatementAndLoops = new ConditionalStatementAndLoops();
        conditionalStatementAndLoops.iFCondition(); //Calling If method.
        conditionalStatementAndLoops.ifElse();//Calling ifElse Method.
        conditionalStatementAndLoops.whileMethod();//While Method
        conditionalStatementAndLoops.switchmethod();//Switch Method.
        conditionalStatementAndLoops.dowhile();//Do while Method
        conditionalStatementAndLoops.forLoop();//Calling Loop Method.
    }

    //Below Method is To Check Number Is Even Or Odd
    public void iFCondition() {
        int inputNumber;
        System.out.println(" Input Number For iFcondition To Check Even Or Odd");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        if (inputNumber % 2 == 0) {   //if number is divisible by 2.It is even
            System.out.println("Number Is Even");
        } else //Not a even number
            System.out.println("Number Is Odd");

    }
    //This Method Is For iFElse
    public void ifElse() {
        int inputNumber;
        System.out.println(" Input Number For iFElse ");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        if (inputNumber > 100) {
            System.out.println("Number is Greater Than 100" + inputNumber);
        } else if (inputNumber > 50) {
            System.out.println("Greater Than 50" + inputNumber);
        } else
            System.out.println("Less Than 50");

    }
    //While Method
    public void whileMethod(){
        int inputNumber;
        System.out.println(" Input Number For whilemethod lessthan 10");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        while (inputNumber>1){
            System.out.println("Inside While");
            inputNumber--;
        }

    }
    //doWhile Method
    public void dowhile(){
        int inputNumber;
        System.out.println(" Input Number For do while method");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        do{                     //executes for one time
            System.out.println(inputNumber);
            inputNumber--;
        }
        while (inputNumber>=1); //condition

    }
    public void switchmethod(){//switch method
        int a=10,b=20,c;
        int choice;
        System.out.println("Enter Choice : 1.Addition,2.subtraction");//enter choices
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){ //switch case
            case 1 :
                c=a+b;//addition
                System.out.println("Addition is " +c);
                break;
            case 2 :
                c=a-b;//subtraction
                System.out.println("Subtraction is "+c);
            default:
                System.out.println("Default Case");
        }

    }

    //This Method Is To Check Loop Functionality
    public void forLoop() {
        int inputNumber;
        System.out.println("Enter Input number for ForLoop ");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        for (int i = 0; i < inputNumber; i++) { //Iterates Until condition gets Failed
            System.out.println("Hello");//Prints message for every condition
        }
    }

}
