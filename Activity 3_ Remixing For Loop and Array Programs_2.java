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
        
        String [ ] friends = new String [5];//Changed array size to 5
        
        System.out.println("Enter the names of five friends:");//Changed ten to five
        for (int i = 0; i <= 4; i = i + 1)//Changed loop condition to end when i is 4(Last index)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The second, third, and fourth names listed were:");//Changed to second third and added fourth
        System.out.println("Second: " + friends[1]);//Changed to second and changed index to 1
        System.out.println("Third: " + friends[2]);//Changed to third and changed index to 2  
        //added
        System.out.println("Fourth: " + friends[3]);//Added fourth and added indext 3

    }

}
