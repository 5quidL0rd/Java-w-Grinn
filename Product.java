/**
This program calculates the total price of two different products according to their quantities and unit prices.   
The formula used is "Quantity * UnitPrice = TotalPrice"

@author bfowler
@version 1.0

COP2253    Workshop 2
File Name: Product.java
*/




import java.util.Scanner;

public class Product {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);    //Introducing our variables
   String ProductName;
   String ProductName2;
   int Quantity;
   int Quantity2;
   double TotalPrice;
   double TotalPrice2;
   double UnitPrice;
   double UnitPrice2;
 
   
   System.out.println("Enter info for Product 1");  //Acquiring information pertaining to Product 1
   Scanner sc = new Scanner(System.in);   
   System.out.println("Product name:"); //Product 1 Name
   ProductName = sc.next();
   
   
   ProductName = Character.toUpperCase(ProductName.charAt(0)) + ProductName.substring(1).toLowerCase();   //ensuring proper capitalization for ProductName
  
  
  System.out.println("Quantity:");  //Product 1 Quantity
  Quantity = sc.nextInt(); 
  
  System.out.println("Unit Price:"); //Product 1 Unit Price
  UnitPrice = sc.nextDouble();
  
  TotalPrice = Quantity * UnitPrice; //Product 1 total price
  

  System.out.println("Enter info for Product 2"); //Acquiring information petraining to Product 2
  
  System.out.println("Product name:");  //Product 2 Name
  ProductName2 = sc.next();
  
  ProductName2 = Character.toUpperCase(ProductName2.charAt(0)) + ProductName2.substring(1).toLowerCase();  //ensuring proper capitalization for ProductName2
  
  
  
  System.out.println("Quantity:");   //Product 2 Quantity 
  Quantity2 = sc.nextInt();
  
  System.out.println("Unit Price:"); //Product 2 Unit Price
  UnitPrice2 = sc.nextDouble();
  
  TotalPrice2 = Quantity2 * UnitPrice2; //Product 2 Total Price
  
 System.out.println("-----------------------------------");    //Constructing the Final Table for Output
 System.out.println("|Product | Qty    | Price | Total|");
 System.out.println("-----------------------------------");
 System.out.print("|" + ProductName  + "   |   " +  Quantity + "    | "); 
 System.out.printf("%.2f",UnitPrice); 
 System.out.printf("  |  %.2f",TotalPrice);
 System.out.println("|");
 System.out.print("|" + ProductName2 + "   |   " + Quantity2 + "    |   ");
 System.out.printf("%.2f",UnitPrice2);
 System.out.printf("|  %.2f" , TotalPrice);
 System.out.println("|");
 System.out.println("-----------------------------------");
 
}
}
 


 
 
 
 
   
