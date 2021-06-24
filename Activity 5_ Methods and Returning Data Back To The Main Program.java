
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

//This program offers 10 math subrountines which the user can choose from
public class MethodsAndReturning {
    //Output
    public static String rountine(int sub,int n){
        String ans = "";
        if(sub==1){
            ans = String.valueOf(factorial(n));
        }else if(sub==2){
            ans = String.valueOf(fibonacci(n));
        }else if(sub==3){
            ans = isPrime(n) ? "Your number is prime" : "Your number isn't prime";
        }else if(sub==4){
            ans = String.format("%.2f",equalTriangleArea(n));
        }else if(sub==5){
            ans = String.format("%.2f",circleArea(n));
        }else if(sub==6){
            ans = ListToStringInt(allFactors(n));
        }else if(sub==7){
            ans = ListToStringInt(primeFactors(n));
        }else if(sub==8){
            ans = String.format("%.2f",squareRoot(n));
        }else if(sub==9){
            ans = String.format("%.2f",cubeRoot(n));
        }else if(sub==10){
            ans = ListToStringDouble(trigValues(n));
        }else{
            System.out.println("Thank you for using my program!");
            System.exit(0);
        }
        return ans;
    }
    //Print functions
    public static void display(int sub, String str){
        System.out.println("===============================================================================");
        System.out.println("Your answer for rountine "+sub+" is: "+str);
        System.out.println("");
        System.out.println("===============================================================================");
    }
    //Converts integer ArrayList to a string
    public static String ListToStringInt(ArrayList<Integer>list){
        String str = "[";
        for(int i = 0;i<list.size();i++){
            if(i==list.size()-1){
                str+=String.valueOf(list.get(i))+"]";
            }else{
                str+=String.valueOf(list.get(i))+", ";
            }
        }
        return str;
    }
    //Converts double ArrayList to a string
    public static String ListToStringDouble(ArrayList<Double>list){
        String str = "[";
        for(int i = 0;i<list.size();i++){
            if(i==list.size()-1){
                str+=String.format("%.2f",list.get(i))+"]";
            }else{
                str+=String.format("%.2f",list.get(i))+", ";
            }
        }
        return str;
    }
    public static void menu(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Choose one of the subrountines");
        System.out.println("");
        System.out.println("1.  Find the factorial of a number");
        System.out.println("2.  Print the nth number of the fibonacci sequence");
        System.out.println("3.  Check if n is prime");
        System.out.println("4.  Find the area of an equalateral triangle with side length n");
        System.out.println("5.  Find the area of a circle with side length n");
        System.out.println("6.  Find all factors of n");
        System.out.println("7.  Find all prime factors of n");
        System.out.println("8.  Find the square root of n");
        System.out.println("9.  Find the cube root of n");
        System.out.println("10. Find the tangent, sine and cosine values of n (Enter n in degrees)");
        System.out.println("0.  Exit Program");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Please input one of the subrountines 1-10");
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
        if(n==1){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //Returns area of an equalateral triangle with side length n
    public static double equalTriangleArea(int n){
        return Math.sqrt(3)/4.0*Math.pow(n,2);
    }
    //Returns the area of the circle with radius n
    public static double circleArea(int n){
        return Math.pow(n,2)*Math.PI;
    }
    //Returns a list of all factors of n
    public static ArrayList<Integer> allFactors(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        return list;
    }
    //Returns a list of prime factors of n
    public static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(isPrime(i)==true && n%i==0){
                list.add(i);
            }
        }
        return list;
    }
    //Returns the square root of n
    public static double squareRoot(int n){
        return Math.sqrt(n);
    }
    //Returns the cube root of n
    public static double cubeRoot(int n){
        return Math.cbrt(n);
    }
    //Returns a list of values containing tan(n) cos(n) sin(n)
    public static ArrayList<Double> trigValues(int n){
        ArrayList<Double>list=new ArrayList<>();
        double value = Math.toRadians(n*1.0);
        list.add(Math.tan(value));
        list.add(Math.cos(value));
        list.add(Math.sin(value));
        return list;
    }
    public static void main(String[] args){ 
        Scanner in = new Scanner (System.in);
        while(true){
            //Menu
            menu();
            int iSub = in.nextInt();
            if(iSub==0){//Checks for exit
                System.out.println(rountine(iSub,0));
            }
            System.out.println("Please input the value of n");
            int iN = in.nextInt();
            
            display(iSub,rountine(iSub,iN));//Performs rountine
        }
        
        
    }
}

