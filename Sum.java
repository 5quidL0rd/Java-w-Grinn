import java.util.Scanner;


public class Sum {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int num1;
int num2;
int sum;

System.out.println("Enter the number of problems you got:");
num1 = input.nextInt();

System.out.println("Enter the number of cars you got.");
num2 = input.nextInt();

sum = num1 + num2;

System.out.println("Here's your score my G:" + sum + ".");



}
}