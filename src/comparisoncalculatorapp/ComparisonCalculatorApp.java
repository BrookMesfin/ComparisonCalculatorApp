package comparisoncalculatorapp;

import java.util.Scanner;

/**
 * @author Brook Mesfin
 */

public class ComparisonCalculatorApp {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //listing numbers to be compared
        int number1, number2, number3;
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter first integer: ");
        number2 = input.nextInt();
        System.out.print("Enter first integer: ");
        number3 = input.nextInt();
        
        //calculations
        int largest = Math.max(number1, Math.max(number2, number3));
        int smallest = Math.min(number1, Math.min(number2, number3));
        int sum = number1+number2+number3;
        int median = sum-largest-smallest;
        int range = largest-smallest;
        int product = number1*number2*number3;
        int average = sum/3;
        int quotient = largest/smallest;
        int remainder = largest%smallest;
        
        //display calculations
        System.out.println("\nFor the numbers "+number1+
                ", "+number2+" and "+number3);
        
        System.out.println("The largest is "+largest+".");
        System.out.println("The smallest is "+smallest+".");
        System.out.println("The median is "+median+".");
        System.out.println("The range is "+range+".");
        System.out.println("Sum is "+sum+".");
        System.out.println("Product is "+product+".");
        System.out.println("Average is "+average+".");
        
        System.out.println("\nQuotient of the largest divided"
                + " by the smallest is "+quotient+".");
        
        System.out.println("\nRemainder of the largest divided"
                + " by the smallest is "+remainder+".");
    }
    
}
