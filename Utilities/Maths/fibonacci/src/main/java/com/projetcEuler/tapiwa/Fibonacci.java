package com.projectEuler.tapiwa;

class Fibonacci
{
	public static int fibonacci(int nth)
	{
		if(nth < 3) return nth;
		return fibonacci(nth - 1) + fibonacci(nth - 2);
	}
}
