package Skillbuilders;

import java.util.Scanner;

public class RecursiveFactorial 
{

	public static int factorial(int num)
	{
		int result = num;
		
		if(num == 0)
		{
			result = 1;
		}
		else if(num >= 1)
		{
			result = result * factorial(num -1);
		}
		//
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int fact;
		
		
		System.out.println("Enter an integer: ");
		fact = input.nextInt();
		
		System.out.println("The factorial of " + fact 
							+ " is " + factorial(fact));

	}

}