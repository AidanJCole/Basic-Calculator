package com.company;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class Main {

    static PrintStream out = System.out;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        String menu = "Menu\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Generate Random Number\nWhat would you like to do? ";

        System.out.print(menu);

        int selector = in.nextInt();

        switch (selector) {
            case 1: Add();
                break;
            case 2: Subtract();
                break;
            case 3: Multiply();
                break;
            case 4: Divide();
                break;
            case 5: Random();
                break;
            default: System.out.println("I'm sorry, " + selector + " wasn't one of the options.");
                break;
        }
    }

    public static double[] get2Numbers(){
        double[] temp = new double[2];
        out.print("What is your first number? ");
        temp[0] = in.nextDouble();
        out.print("What is the second number? ");
        temp[1] = in.nextDouble();
        return temp;
    }

    public static void printResult(double result){
        out.print("Answer: " + result);
    }

    public static void Add(){
        double[] results = get2Numbers();
        out.print("Answer: " + (results[0]+results[1]));
    }

    public static void Subtract(){
        double[] results = get2Numbers();
        printResult(results[0]-results[1]);
    }

    public  static void Multiply(){
        double[] results = get2Numbers();
        printResult(results[0]*results[1]);
    }

    public static void Divide(){
        double[] results = get2Numbers();
        if (results[1] != 0){
            printResult(results[0]/results[1]);
        }
        else{
            out.print("I'm sorry, you can't divide by zero.");
        }
    }

    public static void Random(){
        Random generator = new Random();

        out.print("What is the lower limit? ");
        double first = in.nextDouble();
        out.print("What is the upper limit? ");
        double second = in.nextDouble();

        if (second < first){
            out.print("I'm sorry, the upper bound is lower than the lower bound.");
        }
        else {
            double range = second - first;
            printResult(generator.nextDouble()*range+first);
        }
    }
}
