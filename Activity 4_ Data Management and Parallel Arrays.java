
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Yan
 * Activity 4: Data Management and Parallel Arrays
 * This program takes in two parallel arrays, one for names and one for the marks. The program can sort the array by marks and return statistics.
 */
public class ParallelArrays {
    //Sorting algorithm
    public static void bubbleSort(){
        int sz = iSize-1;
        for(int i = 0;i<sz;i++){
            for(int j = 0;j<sz-i;j++){
                if(MarkList[j]>MarkList[j+1]){//sorts by marks
                    //swap the values of MarkList
                    int iTemp = MarkList[j];
                    MarkList[j] = MarkList[j+1];
                    MarkList[j+1] = iTemp;
                    //swap the values of NameList
                    String sTemp = NameList[j];
                    NameList[j] = NameList[j+1];
                    NameList[j+1] = sTemp;
                }
            }
        }
    }
    //Displays the arrays
    public static void display(){
        for(int i =0;i<iSize;i++){
            System.out.println("Student name: "+NameList[i]+"  | Grade: "+MarkList[i]);
        }
    }
    //Finds the average of the MarkList array
    public static double findAverage(){
        double total = 0;
        for(int i = 0;i<iSize;i++){
            total += MarkList[i];
        }
        return total/iSize;
    }
    //Finds the median of the MarkList array
    public static double findMedian(){
        bubbleSort();//Sorts the array
        if(iSize%2==0){//If even find the average value of the middle two values
            return 1.0*(MarkList[iSize/2-1]+MarkList[iSize/2])/2.0;
        }else{//Else return middle value
            return MarkList[iSize/2];
        }
    }
    //Display statistics
    public static void Statistics(){
        double iAverage = findAverage();
        double iMedian = findMedian();
        
        System.out.printf("The average of the class is: %.2f",iAverage);
        System.out.println("%");
        System.out.printf("The median of the class is: %.2f",iMedian);
        System.out.println("%");
    }        
    
    //Function for checking if Integer x is in range of 1-100
    public static boolean inRange(int x){
        return x>=0 && x<=100;
    }
    public static String NameList[];//List for names
    public static int MarkList[];//List for Marks
    public static int iSize;
    public static void main(String[] args){ 
        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to your classroom analytics!");
        System.out.println("Please input how many people are in your class");
        iSize = in.nextInt();
        NameList = new String[iSize];
        MarkList = new int[iSize];
        for(int i = 0;i<iSize;i++){
            //Input name of student
            System.out.println("Please enter a students name: ");
            NameList[i]=in.next();
            //Data Validation for input for mark
            boolean bValid = false;
            while(!bValid){
                System.out.println("Please enter the students current average(%): ");
                String temp = in.next();
                try{
                    MarkList[i] = Integer.parseInt(temp);
                    //Must be within 1-100
                    if(inRange(MarkList[i])){
                        bValid = true;
                    }else{
                        System.out.println("Please enter a mark within 0-100%");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Invalid input");
                }
            }
        }
        bubbleSort();
        display();
        Statistics();
    }
}
