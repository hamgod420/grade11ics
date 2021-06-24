
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamgod
 */

//This program offers 5 math subrountines which the user can choose from
public class FirstRoutine {
    //Output
    public static void rountine(int sub,int n){
        if(sub==1){
            System.out.println("===============================================================================");
            System.out.println("The factorial of "+n+" is:");
            System.out.println(factorial(n));
            System.out.println("");
            System.out.println("===============================================================================");
        }else if(sub==2){
            System.out.println("===============================================================================");
            System.out.println("Term "+n+" of the Fibonacci sequence is:");
            System.out.println(fibonacci(n));
            System.out.println("");
            System.out.println("===============================================================================");
        }else if(sub==3){
            System.out.println("===============================================================================");
            System.out.println(isPrime(n) ? "Your number is prime" : "Your number isn't prime");
            System.out.println("");
            System.out.println("===============================================================================");
        }else if(sub==4){
            System.out.println("===============================================================================");
            System.out.println("The area of the circle with radius "+n+" is:");
            System.out.printf("%.2f",circleArea(n));
            System.out.println("");
            System.out.println("===============================================================================");
        }else if(sub==5){
            System.out.println("===============================================================================");
            System.out.println("The list of factors for "+n+" is:");
            System.out.println(allFactors(n));
            System.out.println("");
            System.out.println("===============================================================================");
        }else{
            System.out.println("Thank you for using my program!");
            System.exit(0);
        }
    }
    //Returns factorial of n
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    //Returns nth term in the fibonacci sequence
    public static int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    //Returns if n is prime or not
    public static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //Returns the area of the circle with radius n
    public static double circleArea(int n){
        return Math.pow(n,2)*Math.PI;
    }
    //Returns a list of all factors
    public static ArrayList<Integer> allFactors(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){ 
        Scanner in = new Scanner (System.in);
        while(true){
            //Menu
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Choose one of the subrountines");
            System.out.println("");
            System.out.println("1. Find the factorial of a number");
            System.out.println("2. Print the nth number of the fibonacci sequence");
            System.out.println("3. Check if n is prime");
            System.out.println("4. Find the area of a circle with side length n");
            System.out.println("5. Find all factors of n");
            System.out.println("0. Exit Program");
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Please input one of the subrountines 1-5");
            int iSub = in.nextInt();
            if(iSub==0){//Checks for exit
                rountine(iSub,0);
            }
            System.out.println("Please input the value of n");
            int iN = in.nextInt();
            
            rountine(iSub,iN);//Performs rountine
        }
        
        
    }
}
