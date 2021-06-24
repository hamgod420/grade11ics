package com.jetbrains;

/*
    Author: Andy Yan
    Date: 2021-04-26
    Activity 2: First Few Programs Part 2
    This program finds the total cost, taxes and grand total from shopping 
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //Declaration of Variables
        int iNusb;
        int iNkeyboard;
        int iNmouse;
        double dTotalCost;
        double dTaxes;
        double dFinalCost;

        //input
        System.out.println("Welcome to my online shop!");
        System.out.print("USB storage devices are $19.99, please enter the amount you would like to purchase: ");
        iNusb = in.nextInt();
        System.out.print("Keyboards are $49.99, please enter the amount you would like to purchase: ");
        iNkeyboard = in.nextInt();
        System.out.print("Computer Mouse $25.99, please enter the amount you would like to purchase: ");
        iNmouse = in.nextInt();

        //calculation
        dTotalCost = iNusb*19.99+iNkeyboard*49.99+iNmouse*25.99;
        dTaxes = 1.13*dTotalCost - dTotalCost;
        dFinalCost = 1.13*dTotalCost;

        //Output
        System.out.printf("The total cost is $%.2f\n",dTotalCost);
        System.out.printf("Additional taxes: $%.2f\n",dTaxes);
        System.out.printf("The grand total is $%.2f",dFinalCost);
    }
}
