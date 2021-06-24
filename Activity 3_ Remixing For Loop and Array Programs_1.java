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

    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] numbers = new int [20];//Changed array size to 20
        int total = 0;
        
        System.out.println("Enter twenty integers and they will be added together:");//changed ten to twenty
        for (int i = 0; i <= 19; i = i + 1)//Changed loop condition to end when i is 19(Last index)
        {
           numbers[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 19; i = i + 1)//Changed loop condition to end when i is 19(Last index)
        {
             total = total + numbers[i];
        }
        
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
        
        
        
        

    }

}
