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
    
    
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("COOL COUNTING PROGRAM\n");
        //input
        System.out.println("Please enter your choice:");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        
        int iChoice = in.nextInt();
        
        System.out.println();//Skip line
        
        //conditions        
        switch(iChoice){
            case 1:
                System.out.println("Now printing numbers from 1 to 10 by 1");
                for(int i = 1;i<=10;i++){//starting from 1 ends at 10 with an increment of 1
                    System.out.println(i);
                }
                break;
            case 2:
                System.out.println("Now printing numbers from 100 to 0 by 10");
                for(int i = 100;i>=0;i-=10){//starting from 100 ends at 0 with an decrement of 10
                    System.out.println(i);
                }
                break;
            case 3:
                System.out.println("Now printing numbers from 50 to 500 by 50");
                for(int i = 50;i<=500;i+=50){//starting from 50 ends at 500 with an increment of 50
                    System.out.println(i);
                }
                break;
            case 4:
                System.out.println("Now printing numbers from 6000 to 1000 by 1000");
                for(int i = 6000;i>=1000;i-=1000){//starting from 6000 ends at 1000 with an increment of 1000
                    System.out.println(i);
                }
                break;
        }
        
        
    }
    
}
