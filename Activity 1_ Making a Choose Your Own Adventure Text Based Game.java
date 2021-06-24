/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author hamgod
 */
public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Intro 
        System.out.println("You are driving to Mcdonalds,\nwhile driving to McDonalds you will need to make decisions that will ensure your safety");
        //Part 1
        System.out.println("The traffic light is yellow turning red, you are 30m from the intersection.");
        System.out.println("Your options are:\n1 Step on the gas a drive through\n2 Slow down and wait for the next light");
        System.out.println("Enter 1 or 2");
        //Part 1 input
        int iChoice1 = in.nextInt();
        //Part 1 conditions
        if(iChoice1==1){
            System.out.println("You decided to speed up and you ended up hitting a car that was turning left.");
            System.out.println("GAME OVER");
            System.exit(0);
        }else{
            System.out.println("You waited for the next light patiently and passed the intersection.");
        }
        //Part 2
        System.out.println("You come across a busy intersection and you need to make a right turn, but it is a red light.");
        System.out.println("Your options are:\n1 Check for people walking on the crosswalk then wait to cross\n2 Check for cars driving on the road then wait to cross\n3 Wait for the light to turn green and cross when there are no people on the crosswalk");
        System.out.println("Enter 1, 2 or 3");
        //Part 2 input
        int iChoice2 = in.nextInt();
        //Part 2 conditions
        if(iChoice2==1){
            System.out.println("You only checked for people on the crosswalk and when you tried to turn you got hit by a car.");
            System.out.println("GAME OVER");
            System.exit(0);
        }else if(iChoice2==2){
            System.out.println("You only checked for cars on the road and ended up hitting a pedestrian on the crosswalk and now you have to go to court.");
            System.out.println("You now go to court for hitting a destrian.");
            System.out.println("Your options are:\n1 Spend the time to hire a well known lawyer to defend yourself\n2 Hire a cheaper lawyer");
            System.out.println("Enter 1 or 2");
            int iCourtChoice = in.nextInt();
            if(iCourtChoice==1){
                System.out.println("Your lawyer wins the case for you and you are free to go.");
            }else{
                System.out.println("Your lawyer fails to win the case for you and you end up in jail.");
                System.out.println("GAME OVER");
                System.exit(0);
            }  
        }else{
            System.out.println("You patiently waited for light to turn green so there is no danger of hitting anyone or getting hit and you turned safely.");
        }
        //Part 3
        System.out.println("You are very thristy and you want a drink.");
        System.out.println("Your options are:\n1 Wait until you get to McDonalds and buy a drink\n2 Drink the can of beer in your cup holder\n3 You try to reach for a bottled water in the back seat");
        System.out.println("Enter 1, 2 or 3");
        //Part 3 input
        int iChoice3 = in.nextInt();
        //Part 3 conditions
        if(iChoice3==1){
            System.out.println("You endured your thrist and safely drove McDonalds to bought a coke at McDonalds");
            System.out.println("GAME COMPLETE");
            System.exit(0);
        }else if(iChoice3==2){
            System.out.println("You forgot your alcohol tolerance wasn't high and you start driving worse.");
            System.out.println("Your options are:\n1 Find nearest parking space to sober up\n2 Endure it and keep driving");
            System.out.println("Enter 1 or 2:");
            int iDrunkChoice = in.nextInt();
            if(iDrunkChoice==1){
                System.out.println("You stop to sober up and after a well rested break you proceed to McDonalds safely.");
                System.out.println("GAME COMPLETE");
            }
        }else{
            System.out.println("You lose control driving with one arm while searching for the water bottle in the back seat. The lost of control resulted in a car crash.");
            System.out.println("GAME OVER");
        }
    }
}
