/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author hamgod
 * 
 * Activity 1: Data Validation and Testing Data
 * This program gives the user 6 stages where each stage is not passed until a correct input is entered
 */
public class Validdata {
    public static void main(String[] args){ 
        Scanner in = new Scanner (System.in);
        while(true){//Infinite loop until condition is met
            System.out.println("Stage 1: Please enter a string that is greater than 6 characters long.");//Message
            String input = in.next();//input
            if(input.length()>6){//condition
                System.out.println("Congratulations, you passed this stage!");//Congulatory message
                break;
            }else{
                System.out.println("Invalid input");//Error message
            }
        }
        while(true){
            System.out.println("Stage 2: Please enter a string that contains at least one lowercase “a”.");
            String input = in.next();
            if(input.contains("a")){
                System.out.println("Congratulations, you passed this stage!");
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
        while(true){
            System.out.println("Stage 3: Please enter a string that is between 5 and 15 characters long, and does not contain the letter “z”.");
            String input = in.next();
            if((input.length()>=5 && input.length()<=15) && input.contains("a")){
                System.out.println("Congratulations, you passed this stage!");
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
        while(true){
            System.out.println("Stage 4: Please enter an integer between 5 and 500.");
            String input = in.next();
            int value=0;//Stores integer value from string
            try{//try and catch for number format error
                value = Integer.parseInt(input);//convert string to integer
                if(value>=5 && value<=500){//condition
                    System.out.println("Congratulations, you passed this stage!");
                    break;
                }else{
                    System.out.println("Invalid input");
                }       
            }catch(NumberFormatException e){
                System.out.println("Invalid input");//Error message
            }
        }
        while(true){
            System.out.println("Stage 5: Please enter an negative integer.");
            String input = in.next();
            int value=0;
            try{
                value = Integer.parseInt(input);
                if(value<0){
                    System.out.println("Congratulations, you passed this stage!");
                    break;
                }else{
                    System.out.println("Invalid input");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input");
            }

        }
        while(true){
            System.out.println("Stage 6: Please enter a positive, odd integer.");
            String input = in.next();
            int value=0;
            try{
                value = Integer.parseInt(input);
                if(value>0 && value%2!=0){
                    System.out.println("Congratulations, you passed all stages!");
                    break;
                }else{
                    System.out.println("Invalid input");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input");
            }
            
        }
    }
}
