package cta;
import java.util.Scanner;

public class FloatingPointTotals {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double userInput;
      double runningTotal = 0;
      
      // Initialize reverse min/max values so that these variables can be used in conditional statements
      double inputMin = Double.MAX_VALUE, inputMax = Double.MIN_VALUE;
      
      // Input counter is used as the loop control variable
      int inputCounter = 0;
      
      // Max loop constant is the loop entry/exit check
      final int MAX_LOOP = 5;
      
      while (inputCounter < MAX_LOOP) {
         System.out.print("Please enter a decimal value: ");
         userInput = s.nextDouble();
         runningTotal += userInput;
         
            if (userInput < inputMin) {
               inputMin = userInput;
            }
            
            if (userInput > inputMax) {
               inputMax = userInput;
            }
      }
      
      System.out.printf("Total: %f\n", runningTotal);
      System.out.printf("Average: %.2f\n", runningTotal / MAX_LOOP);
      System.out.printf("Minimum: %f\n", inputMin);
      System.out.printf("Maximum: %f\n", inputMax);
      System.out.printf("Simple interest on total at 20%: %.2f\n", runningTotal * 0.2);
   }

}
