package com.jetbrains;

/*
    Author: Andy Yan
    Date: 2021-04-26
    Activity 2: Solving Math Problems Part 1
    This program finds the distance between two points on the coordinate plane
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //Declaration of Variables
        String sName;
        double dXvalue1;
        double dYvalue1;
        double dXvalue2;
        double dYvalue2;
        double dDistance;

        //Input
        System.out.print("Hello user, what is your name?: ");
        sName = in.next();
        System.out.println("Welcome "+sName+" to my program!\nThis program finds the shortest distance between two points on the coordinate plane. Please input the coordinates of your first point");
        //Input of first point
        System.out.print("Value of X: ");
        dXvalue1 = in.nextDouble();
        System.out.print("Value of Y: ");
        dYvalue1 = in.nextDouble();
        //Input of second point
        System.out.println("Now please enter the coordinates of your second point.");
        System.out.print("Value of X: ");
        dXvalue2 = in.nextDouble();
        System.out.print("Value of Y: ");
        dYvalue2 = in.nextDouble();

        //Calculation
        System.out.println("To find the shortest distance between points ("+dXvalue1+","+dXvalue2+") and ("+dXvalue1+","+dXvalue2+") we will use the distance formula.");
        dDistance = Math.sqrt(Math.pow(dXvalue2-dXvalue1,2)+Math.pow(dYvalue2-dYvalue1,2));//distance formula
        System.out.println("The shortest distance between the two points is "+dDistance);
        //Conclusion
        System.out.println("Thank you for using my program, re-run the program if you want to use it again :)");
    }
}
