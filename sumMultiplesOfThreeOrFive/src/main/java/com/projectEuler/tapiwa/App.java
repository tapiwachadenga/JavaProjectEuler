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
        System.out.printf( "\nEnter limit: " );
	int limit = new Scanner(System.in).nextInt();
	System.out.printf("\nSumMultiplesOfThreeOrFive(%d) = %d\n\n", limit, SumMultiplesOfThreeOrFive.sumMultiplesOfThreeOrFive(limit));
    }
}
