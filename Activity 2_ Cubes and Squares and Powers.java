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
        Scanner in = new Scanner(System.in);
        
        System.out.println("1… Find the value of a number squared (NOTE: 2^2 = 2 x 2)");
        System.out.println("2… Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)");
        System.out.println("3… Find the value of a number, to any power");
        System.out.println("4… Exit");
        
        while(true){//Infinite loop until 4 is entered
            System.out.println("Enter your option: ");
            int iOption = in.nextInt();
            //Early if statement to check if user wants to exit before going through the input process
            if(iOption==4){
                break;
            }
            System.out.println("Enter your number: ");
            int iNum = in.nextInt();
            int iTemp = 1;//Temp variable to store the product
            if(iOption==1){
                for(int i = 0;i<2;i++){
                    iTemp*=iNum;
                }
                System.out.println(iNum+" squared is "+iTemp);
            }else if(iOption==2){
                for(int i = 0;i<3;i++){
                    iTemp*=iNum;
                }
                System.out.println(iNum+" cubed is "+iTemp);
            }else if(iOption==3){
                System.out.println("Enter your power: ");
                int iPower = in.nextInt();
                for(int i = 0;i<iPower;i++){
                    iTemp*=iNum;
                }
                System.out.println(iNum+" to the power of "+iPower+" is "+iTemp);
            }
        }
        
        
        

    }

}
