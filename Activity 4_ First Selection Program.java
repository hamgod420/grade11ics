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
        //input
        System.out.println("Please enter amount spent:");
        double dPayment = in.nextDouble();
        //conditions
        if(dPayment>=0.01 && dPayment<=40.00){//0-40
            
            System.out.printf("You spent: $%.2f\n",dPayment);//Amount Spent
            System.out.println("You are saving 10%");//Percentage Saved
            System.out.printf("You are saving: $%.2f \n",(dPayment*0.1));//Amount Saved
            System.out.printf("Your total is: $%.2f \n",(dPayment*0.9));//Final Cost
            
          
        }else if(dPayment>=40.01 && dPayment<=80.00){//40-80
            
            System.out.printf("You spent: $%.2f\n",dPayment);
            System.out.println("You are saving 20%");
            System.out.printf("You are saving: $%.2f \n",(dPayment*0.2));
            System.out.printf("Your total is: $%.2f \n",(dPayment*0.8));
            
        }else if(dPayment>=80.01 && dPayment<=120.00){//80-120
            
            System.out.printf("You spent: $%.2f\n",dPayment);
            System.out.println("You are saving 30%");
            System.out.printf("You are saving: $%.2f \n",(dPayment*0.3));
            System.out.printf("Your total is: $%.2f \n",(dPayment*0.7));
            
        }else if(dPayment>120.00){//120...
            
            System.out.printf("You spent: $%.2f\n",dPayment);
            System.out.println("You are saving 40%");
            System.out.printf("You are saving: $%.2f \n",(dPayment*0.4));
            System.out.printf("Your total is: $%.2f \n",(dPayment*0.6));
            
        }
        
    }
    
}
