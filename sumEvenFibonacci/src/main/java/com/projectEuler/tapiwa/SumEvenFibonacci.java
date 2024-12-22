package com.projectEuler.tapiwa;

import java.util.Scanner;
// import Utilities.Maths.Fibonacci;

class SumEvenFibonacci
{
	public static int sumEvenFibonacci(int limit)
	{
		System.out.printf("\nEnter limit: ");
		// int limit = new Scanner(System.in).nextInt();
		
		if(limit < 3) return limit;

		int sum = 0;
		int counter = 1;

		while(Fibonacci.fibonacci(counter) < limit) 
		{
			if(Fibonacci.fibonacci(counter) % 2 == 0) sum += Fibonacci.fibonacci(counter);
			counter++;
		}
		return sum;
	}
}
