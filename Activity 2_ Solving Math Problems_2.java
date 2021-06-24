package com.jetbrains;

/*
    Author: Andy Yan
    Date: 2021-04-26
    Activity 2: Solving Math Problems Part 2
    This program finds the circumference and area of a circle give the radius
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //Declaration of Variables
        String sName;
        double dRadius;
        double dCircumference;
        double dArea;

        //Input
        System.out.print("Hello user, what is your name?: ");
        sName = in.next();
        System.out.println("Welcome "+sName+"!\nIn this program we will find the circumference and area of a circle.");
        System.out.print("Please input the radius of the circle: ");
        dRadius = in.nextInt();

        //calculation
        dCircumference = 2 * Math.PI * dRadius;
        System.out.println("We can find the circumference of the circle by using the formula 2*pi*r\nThe circumference is: "+dCircumference);
        dArea = Math.PI * Math.pow(dRadius,2);
        System.out.println("We can find the circumference of the circle by using the formula pi*r^2\nThe area is: "+dArea);

        //Conclusion
        System.out.println("Thank you for using my program, re-run the program if you want to use it again :)");
    }
}
