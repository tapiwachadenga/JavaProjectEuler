package com.projectEuler.tapiwa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.printf( "\nEnter number: " );
	int num = new Scanner(System.in).nextInt();
	System.out.printf("\nfibonacci(%d) = (%d)\n", num, Fibonacci.fibonacci(num));
    }
}
