/**
This program calculates the ending balance of an amount put in with its respective interest
The formula used is b + (b * IR/100 * .25) where b is the starting balance and IR is interest rate

@author bfowler
@version 1.0

COP2253    Workshop 3
File Name: Product.java
*/





import java.util.Scanner;

public class InterestCalculator {
   public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      int quarters;
      double Interest_rate;
      double endingbalance;
      double Starting_balance;
      
      
   
   
  while (true) {   
  
  for (;;) {
  System.out.println("Enter number of quarters from 1 to 10");
  if (input.hasNextInt()) {
  quarters = input.nextInt();
  if (quarters >= 1 && quarters <= 10) {
  break;
   }
   }
    input.nextLine(); 
    System.out.println("Number of quarters must be between 1 and 10 inclusive");
    }
    
  
  for (;;) {
  System.out.println("Enter the beginning principal balance greater than 0");
  if (input.hasNextInt()) {
  Starting_balance = input.nextDouble();
  if (Starting_balance > 0) {
  break;
  }
  }
   input.nextLine();
   System.out.println("Beginning balance must be greater than zero.");
   }
 
 for (;;) {
 System.out.println("Enter the interest rate percentage without the percent sign greater than 0% and less than/equal to 20%");
 if (input.hasNextDouble()) {
 Interest_rate = input.nextDouble();
 if (Interest_rate <= 20.00 && Interest_rate > 0.00) {
 break;
 }
 }
   input.nextLine();
  System.out.println("Interest rate must be between 1 and 20 inclusive");
  }
  

 
System.out.println("You entered a principal balance of " + Starting_balance + " for " + quarters + " at " + Interest_rate + "." + " Is this correct? (y/n)");

String confirm = input.next();

 if (confirm.equalsIgnoreCase("y")) {
 break;
}
}
        
 
 System.out.println("Quarter     Beginning          Interest           Ending");
 
 System.out.println("Number      Balance            Earned             Balance");
 
 
 
 
 for (int i = 1; i <= quarters; i++) {
            double Interest_earned = Starting_balance * Interest_rate/100 * 0.25;
            double Ending_balance = Starting_balance + Interest_earned;
            
           
            
            System.out.printf("%d\t        $%.2f\t\t        $%.2f\t\t       $%.2f%n",  i, Starting_balance, Interest_earned, Ending_balance);
             
            
            Starting_balance = Ending_balance;             
          
            
            Interest_earned = Interest_rate;
        }
        
        input.close();
    }
}
 
 
 
 
 
 
 
 
 
 
        
        
        
        
       
 
   
 
  






     
      
      
