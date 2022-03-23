package positive.base;

import java.util.Scanner;
import java.util.*;

public class Positive {

  public Positive(){

    } 
    
    public static boolean checkPositiveNumber(double userInput){
        
        return userInput >= 0;
         
    }

    public static double PositiveEquivalent(double userInput){

        return Math.abs(userInput);

    }

    public static double calDifference(double num1, double num2){

        return num1 - num2;

    }

    public static void printDifference(){

        Scanner reader = new Scanner(System.in);
        
        try {

            System.out.print("Enter first number: ");
            double input1 = reader.nextDouble();

            boolean a = checkPositiveNumber(input1);

            if (a){

                System.out.print("Enter second number: ");
                double input2 = reader.nextDouble();
                double posInput2 = PositiveEquivalent(input2);


                System.out.println(calDifference(input1, posInput2));

            }

            else{
                
                System.out.println("Not a posistive number");
            }    

            
        } catch (InputMismatchException e) {
                System.out.println("Invalid input: This value is not a number");
        }

    }


    
}
