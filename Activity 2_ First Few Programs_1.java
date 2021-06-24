package com.jetbrains;

/*
    Author: Andy Yan
    Date: 2021-04-26
    Activity 2: First Few Programs Part 1
    This program finds the amount of water used to manufacture computer/monitor combos
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //Declaration of Variables
        int iNumOfComputers;
        double dWaterUsed;
        //Input
        System.out.print("Please input the number of computers/monitor combos owned: ");
        iNumOfComputers = in.nextInt();
        //Calculation
        dWaterUsed = 1.5 * iNumOfComputers;
        System.out.println(dWaterUsed+" tons of water was used to manufacture "+iNumOfComputers+" computers/monitor combos.");

    }
}
