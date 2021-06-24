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
        
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};//Added 65.8, 44.8, 88.6
        double total=0;
        double average;
        
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)//Changed loop condition to end when i is 8(Last index)
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=8; i= i + 1)//Changed loop condition to end when i is 8(Last index)
        {
            total = total + marks[i];
        }
        
        average = total/9;//Changed 6 to 9 because 3 more marks were added
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        System.out.println("The average mark is:");
        System.out.println(average);

    }

}
