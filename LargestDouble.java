import java.util.Scanner;
public class LargestDouble {
 public static void main(String arg[]) 
 {
 System.out.println("Enter 20 Numbers"); 
  Scanner in = new Scanner(System.in); 
  double arr[] = new double[20]; 
  for(int i=0; i<20;i++) {
  arr[i]=in.nextDouble();
   }
    double max=arr[0]; 
    for(int i=1; i<20;i++) 
    {
    if(arr[i]>max) 
    {
    max=arr[i]; 
    }
    }
     System.out.print("The maximum value is "); System.out.println(max); 
     }
     }



