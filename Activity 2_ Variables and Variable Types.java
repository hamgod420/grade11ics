package com.jetbrains;

/*
    Author: Andy Yan
    Date: 2021-04-26
    Activity 2: Variables and Variable Types
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Declaration of Variables
        String sFirstName;
        String sLastName;
        int iAge;       //Unit: years
        double dHeight; //Unit: cm
        double dWeight; //Unit: kg
        boolean bEnjoysExercise;

        //Initialization of Variables
        sFirstName = "Andy";
        sLastName  = "Yan";
        iAge = 15;
        dHeight = 179.5;
        dWeight = 69.1;
        bEnjoysExercise = true;

        //Outputting
        System.out.println("First Name: "+sFirstName);
        System.out.println("Last Name:  "+sLastName);
        System.out.println("Age: "+iAge);
        System.out.println("Height: "+dHeight+"cm");
        System.out.println("Weight: "+dWeight+"kg");
        System.out.println("Enjoys exercise: "+bEnjoysExercise);

    }
}
